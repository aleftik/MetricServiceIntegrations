package com.appdynamics.demo.metricservice.integration;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.eclipse.jetty.server.handler.AbstractHandler;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.server.Request;


public class AnamolyHandler extends AbstractHandler implements Runnable {
    private boolean normalState = true;
    private String endPoint;

    public AnamolyHandler(String endPoint) {
        this.endPoint = endPoint;
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
        if ((policy != null) || (!"".equals(policy))) {
            if ("reset".equals(policy)) {
                normalState = true;
            } else {
                if (normalState == true) {
                    fireEvent();
                    normalState = false;
                } else {
                    fireEvent();
                    normalState = true;
                }
            }
        }
        baseRequest.setHandled(true);
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("Policy updated");
        
    }

    @Override
    public void run() {
        reportHealthMetric();
    }

    private void reportHealthMetric() {
        String json = buildJson();
        post(json,false);

    }

    private void post(String json, boolean isEvent) {
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
                metricInst.addProperty("metric", "Cisco.ACI.System.FabricHealth.Score");
                metricInst.addProperty("type","gauge");
                JsonArray tags = new JsonArray();
                tags.add("sources:CiscoACI");
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
                metricInst2.addProperty("metric", "Cisco.ACI.System.Travel_log.EPGHealth.Score");
                metricInst2.addProperty("type","gauge");
                JsonArray tags2 = new JsonArray();
                tags2.add("sources:CiscoACI");
                tags2.add("application:travel_log");

                metricInst2.add("tags", tags2);
                metricArray.add(metricInst2);

        series.add("series",metricArray);
        return series.toString();
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

/*
-d '{
      "title": "Did you hear the news today?",
      "text": "Oh boy!",
      "priority": "normal",
      "tags": ["environment:test"],
      "alert_type": "info"
}' \
 */
    private void fireEvent() {
        String json = buildEvent();
        post(json,true);
    }

    private String buildEvent() {
        JsonObject event = new JsonObject();
        event.addProperty("title","QoSPol Updated");
        event.addProperty("text", "Affected Object: uni/infra code:E4202964 cause: admin-state-change description: QOS Policy updated");
        event.addProperty("date_happened",(System.currentTimeMillis()/1000)-(5*60));
        JsonArray tags = new JsonArray();
        tags.add("application:travel_log");
        event.add("tags",tags);
        event.addProperty("priority","normal");
        event.addProperty("alert_type", "info");
        event.addProperty("source_type_name","CiscoACI");
        return event.toString();
    }
}
