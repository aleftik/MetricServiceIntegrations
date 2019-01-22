package com.appdynamics.demo.metricservice.integration;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.eclipse.jetty.server.handler.AbstractHandler;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.server.Request;



public class AnamolyHandler extends AbstractHandler implements Runnable {
    private static final Logger logger = Logger.getLogger(AnamolyHandler.class.getName());
    private boolean normalState = true;
    private boolean btNormalState = true;
    private String endPoint;
    private String fxEndpoint;
    private String fxApiKey;


    public AnamolyHandler(String endPoint,String apiKey, String fxEndpoint,String fxApiKey) {
        this.endPoint = endPoint + "?api_key=" + apiKey;
        this.fxEndpoint = fxEndpoint;
        this.fxApiKey = fxApiKey;
        ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this,0,1 , TimeUnit.MINUTES);
    }


    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException,
            ServletException {
        String policy = request.getParameter("changePolicy");
        String btstate = request.getParameter("bt");
        String key = request.getParameter("key");
        if ((key != null) && (!"".equals(key)) && ("2482".equals(key))) {
            if ((policy != null) && (!"".equals(policy))) {
                handleACIPolicyEvent(response, policy);
            }

            if ((btstate!=null) && (!"".equals(btstate))) {
                handleBTChangeEvent(response, btstate);
            }
        }
        baseRequest.setHandled(true);
        response.setStatus(HttpServletResponse.SC_OK);
        response.flushBuffer();
    }

    private void handleBTChangeEvent(HttpServletResponse response, String btstate) throws IOException {
        if ("reset".equals(btstate)) {
            logger.info("Recieved Request to Reset BT Perf");
            this.btNormalState = true;
        } else if("slow".equals(btstate)) {
            btNormalState = false;
            logger.info("Recieved Request to Slow BT Perf");
        }
        response.getWriter().println("BT updated");
    }

    private void handleACIPolicyEvent(HttpServletResponse response, String policy) throws IOException {
        if ("reset".equals(policy)) {
            logger.info("Recieved Request to Reset Policy");
            normalState = true;
        } else {
            if (normalState == true) {
                fireEvent();
                normalState = false;
                logger.info("Recieved Request to Slow Policy");
            } else {
                fireEvent();
                normalState = true;
                logger.info("Recieved Request to Fast Policy");
            }
        }
        response.getWriter().println("Policy updated");
    }

    @Override
    public void run() {
        reportHealthMetric();
        callEndpoint();
    }

    public void callEndpoint() {
        ClientBuilder.newClient().target("https://3qhdqa7qmg.execute-api.eu-west-1.amazonaws.com/dev/test").request().get();

    }

    private void reportHealthMetric() {
        String json = buildJson();
        String fxJson = buildJsonForFX();

        postDD(json,false);
        postFX(fxJson, false);
        json = buildJsonForCheckout().toString();
        postDD(json,false);
        postFX(buildBTMetricsForFx("checkout",true),false);
        json = buildJsonForAddToCart().toString();
        postDD(json,false);
        postFX(buildBTMetricsForFx("addToCart",true),false);
        json = buildJsonForConfirmOrder().toString();
        postDD(json,false);
        postFX(buildBTMetricsForFx("confirm_order",false),false);
        postFX(buildRevenueMetric(),false);
    }

    private JsonObject buildJsonForCheckout() {
        return MetricWriterUtils.createDDBTMetric("business_transactions",getBTResponseTime(btNormalState),getCPM(),getEPM(),"checkout");
    }

    private JsonObject buildJsonForAddToCart() {
        return MetricWriterUtils.createDDBTMetric("business_transactions",getBTResponseTime(true),getCPM(),getEPM(),"add_to_cart");
    }

    private JsonObject buildJsonForConfirmOrder() {
        return MetricWriterUtils.createDDBTMetric("business_transactions",getBTResponseTime(true),getCPM(),getEPM(),"confirm_order");
    }

    private void postDD(String json, boolean isEvent) {
        Client client = ClientBuilder.newClient();
        String url = this.endPoint;
        //hack
        if (isEvent) {
            url = url.replace("series","events");
        }
        try {
            Response response = client.target(url).request().post(Entity.json(json));
            if (response.getStatus() != 202) {
                System.err.println("Problem reporting health metric to DD for Cisco ACI");
            }
        }  catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    private void postFX(String json, boolean isEvent) {
        Client client = ClientBuilder.newClient();
        String url = this.fxEndpoint;
        //hack
        if (isEvent) {
            url = url.replace("datapoint","event");
        }
        try {
            Response response = client.target(url).request().header("X-SF-TOKEN",fxApiKey).header("Content-Type",MediaType.APPLICATION_JSON_TYPE).post(Entity.json(json));
            if (response.getStatus() != 200) {
                System.err.println("Problem reporting health metric for Cisco ACI");
            }
        }  catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    private String buildJson() {
        JsonObject series = new JsonObject();
        JsonArray metricArray =  new JsonArray();         
                JsonObject metricInst = new JsonObject();
                JsonArray points = new JsonArray();
                JsonArray point = new JsonArray();
                point.add((int)(System.currentTimeMillis()/1000));

                point.add(getHealthMetric(true));
                points.add(point);
                metricInst.add("points", points);
                metricInst.addProperty("host", "sandboxapicdc.cisco.com");
                metricInst.addProperty("metric", "cisco.aci.system.fabric.health");
                metricInst.addProperty("type","gauge");
                JsonArray tags = new JsonArray();
                tags.add("sources:Cisco ACI");
                tags.add("type:Cisco ACI");
                tags.add("Cisco ACI");
                metricInst.add("tags", tags);
                metricArray.add(metricInst);

                JsonObject metricInst2 = new JsonObject();
                JsonArray points2 = new JsonArray();
                JsonArray point2 = new JsonArray();
                point2.add((int)(System.currentTimeMillis()/1000));

                point2.add(getHealthMetric(normalState));
                points2.add(point2);
                metricInst2.add("points", points2);
                metricInst2.addProperty("host", "sandboxapicdc.cisco.com");
                metricInst2.addProperty("metric", "cisco.aci.tenant.health");
                metricInst2.addProperty("type","gauge");
                JsonArray tags2 = new JsonArray();
                tags2.add("sources:Cisco ACI");
                tags2.add("type:Cisco ACI");
                tags2.add("ciscoaci");
                tags2.add("application:store");

                metricInst2.add("tags", tags2);
                metricArray.add(metricInst2);

        series.add("series",metricArray);
        return series.toString();
    }

    private String buildJsonForFX() {
        JsonObject datapoints = new JsonObject();

        JsonArray gauges = new JsonArray();
        JsonObject fabricHealthPoint = new JsonObject();
        fabricHealthPoint.addProperty("metric","cisco.aci.system.fabric.health");
        fabricHealthPoint.addProperty("value",getHealthMetric(true));
        JsonObject dimensions = new JsonObject();
        dimensions.addProperty("host","sandboxapicdc.cisco.com");
        dimensions.addProperty("apic_controller","sandboxapicdc.cisco.com");
        fabricHealthPoint.add("dimensions", new JsonObject());
        gauges.add(fabricHealthPoint);

        JsonObject tenantHealthPoint = new JsonObject();
        tenantHealthPoint.addProperty("metric","cisco.aci.tenant.health");
        tenantHealthPoint.addProperty("value",getHealthMetric(normalState));
        tenantHealthPoint.add("dimensions",dimensions);
        gauges.add(tenantHealthPoint);



        datapoints.add("gauge",gauges);

        return datapoints.toString();
    }

    private long getBTResponseTime(boolean normal) {
        int min = 800;
        int max = 1200;
        if(normal!=true) {
            min = 5000;
            max = 25000;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private int getCPM() {
        Random random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
    }

    private int getEPM() {
        Random random = new Random();
        return random.nextInt(3 - 1 + 1) + 1;
    }

    private int getRPM (boolean normal) {
        int min = 70000;
        int max = 120000;
        if(normal!=true) {
            min = 6500;
            max = 25000;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private int getHealthMetric(boolean normal) {
        int min = 92;
        int max = 100;
        if(normal!=true) {
            min = 30;
            max = 60;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private void fireEvent() {
        String event2 = buildEvent2();
        String json = buildEvent();
        String fxJson = buildFXEvent();
        postDD(json,true);
        postDD(event2,true);
        postFX(fxJson, true);

    }

    private String buildEvent() {

        JsonObject event = new JsonObject();
        event.addProperty("title","QoSPol Updated");
        event.addProperty("text", "");
        event.addProperty("date_happened",(System.currentTimeMillis()/1000));
        JsonArray tags = new JsonArray();
        tags.add("application:store");
        tags.add("sources:cisco aci");
        event.add("tags",tags);
        event.addProperty("priority","normal");
        event.addProperty("alert_type", "info");
        event.addProperty("source_type_name","cisco aci");
        return event.toString();
    }

    private String buildRevenueMetric() {
        JsonObject datapoints = new JsonObject();

        JsonArray gauges = new JsonArray();
        JsonObject rpm = new JsonObject();
        rpm.addProperty("metric","appdynamics.store.revenue_per_minute");
        rpm.addProperty("value", getRPM(normalState));

        JsonObject dimensions = new JsonObject();
        dimensions.addProperty("host","pm3.appdynamics.com");
        dimensions.addProperty("source","appdynamics");
        dimensions.addProperty("application","store");
        rpm.add("dimensions", dimensions);
        gauges.add(rpm);


        datapoints.add("gauge",gauges);
        return datapoints.toString();

    }


    public String buildEvent2() {
        JsonObject puppetEvent = new JsonObject();
        puppetEvent.addProperty("title","Updating APIC configurations");
        puppetEvent.addProperty("text", "Setting new Quality of Service parameters");
        puppetEvent.addProperty("date_happened",((System.currentTimeMillis()-2000)/1000));
        JsonArray puppetTags = new JsonArray();
        puppetTags.add("application:store");
        puppetTags.add("sources:puppet");
        puppetEvent.add("tags",puppetTags);
        puppetEvent.addProperty("priority","normal");
        puppetEvent.addProperty("alert_type", "info");
        puppetEvent.addProperty("source_type_name","puppet");
        return puppetEvent.toString();
    }

    private String buildBTMetricsForFx(String btname, boolean jitter) {
        JsonObject datapoints = new JsonObject();

        JsonArray gauges = new JsonArray();
        JsonArray counts = new JsonArray();
        JsonObject BTPointART = new JsonObject();
        BTPointART.addProperty("metric","appdynamics.business_transaction.average_response_time");
        if (jitter) {
            BTPointART.addProperty("value", getBTResponseTime(normalState));
        } else {
            BTPointART.addProperty("value", getBTResponseTime(true));
        }
        JsonObject dimensions = new JsonObject();
        dimensions.addProperty("host","pm3.appdynamics.com");
        dimensions.addProperty("bt_name",btname);
        dimensions.addProperty("source","appdynamics");
        dimensions.addProperty("application","store");
        dimensions.addProperty("tier_name", "web_tier");
        BTPointART.add("dimensions", dimensions);
        gauges.add(BTPointART);


        JsonObject BTPointCPM = new JsonObject();
        BTPointCPM.addProperty("metric","appdynamics.business_transaction.calls_per_minute");
        BTPointCPM.addProperty("value",getCPM());
        JsonObject cpmdimensions = new JsonObject();
        cpmdimensions.addProperty("host","pm3.appdynamics.com");
        cpmdimensions.addProperty("bt_name",btname);
        cpmdimensions.addProperty("source","appdynamics");
        cpmdimensions.addProperty("application","store");
        cpmdimensions.addProperty("tier_name", "web_tier");
        BTPointCPM.add("dimensions", cpmdimensions);
        counts.add(BTPointCPM);

        JsonObject BTPointEPM = new JsonObject();
        BTPointEPM.addProperty("metric","appdynamics.business_transaction.errors_per_minute");
        BTPointEPM.addProperty("value",getCPM());
        JsonObject epmdimensions = new JsonObject();
        epmdimensions.addProperty("host","pm3.appdynamics.com");
        epmdimensions.addProperty("bt_name",btname);
        epmdimensions.addProperty("source","appdynamics");
        epmdimensions.addProperty("application","store");
        epmdimensions.addProperty("tier_name", "web_tier");
        BTPointEPM.add("dimensions", epmdimensions);
        counts.add(BTPointEPM);



        datapoints.add("gauge",gauges);
        datapoints.add("counter",counts);

        return datapoints.toString();

    }


    /*
    curl -i \
  --header "Content-Type: application/json" \
  --header "X-SF-TOKEN: YOUR_ORG_ACCESS_TOKEN" \
  -X POST \
  -d \
  '[{
    "category": "USER_DEFINED",
    "eventType": "test event",
    "dimensions": { "environment": "production", "service": "API" },
    "properties": { "sha1": "1234567890abc" },
    "timestamp": 1480870800000
  }]' \
  https://ingest.signalfx.com/v2/event
     */

    private String buildFXEvent() {
        JsonArray events = new JsonArray();
        JsonObject event = new JsonObject();
        event.addProperty("category","ALERT");
        event.addProperty("eventType", "cisco aci");
        JsonObject dimensions = new JsonObject();
        dimensions.addProperty("environment","production");
        dimensions.addProperty("tenant","store");
        event.add("dimensions", dimensions);
        JsonObject properties = new JsonObject();
        properties.addProperty("Affected_Object","infra code E4202964");
        properties.addProperty("cause","admin-state-change");
        properties.addProperty("description","QOS Policy updated");
        event.addProperty("timestamp",(System.currentTimeMillis()-1000));
        event.add("properties",properties);
        events.add(event);
        return events.toString();

    }
}
