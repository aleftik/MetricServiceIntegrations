package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsBackend;
import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsNode;
import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsTier;

import com.appdynamics.demo.metricservice.integration.cisco.umbrella.model.DomainSecurityInfo;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MetricWriterUtils {

    public static String cleanupPathForBackend(String path) {
        if (path.contains("Discovered")) {
            path = path.substring(35);
        }
        path = path.replace('|','.');
        path = path.replace(' ', '_');
        return path;
    }

    public static String cleanupPathForNetwork(String path) {
        path = path.substring("Application Infrastructure Performance|Web|Advanced ".length());
        path = path.replace('|','.');
        path = path.replace(' ', '_');
        return path;
    }

    public static String cleanupPath(String path) {
        path = path.substring(55);
        path = path.replace('|','.');
        path = path.replace(' ', '_');
        return path;
    }

    public static String [] generateTagForBackend(String metricPath, MetricUploadRequest request) {
        List<AppDynamicsBackend> backendList = request.getBackends();
        List<String> tags = new ArrayList<String>();
        for (AppDynamicsBackend backend:backendList) {
            Map backendProps = backend.getProperties();
            if (metricPath.contains(backend.getName())) {
                tags.add("name:" + backend.getName());
                if (backendProps.get("HOST") != null) {
                    tags.add("host:" + backendProps.get("HOST"));
                }
                if (backendProps.get("Topic ARN") != null) {
                    tags.add("topicarn:" + backendProps.get("Topic ARN"));
                }

                if (backendProps.get("Bucket Name") != null) {
                    tags.add("bucketname:"+ backendProps.get("Bucket Name"));
                }
            }
        }
        String [] tagsArr = new String [tags.size()];
        return tags.toArray(tagsArr);
    }


    public  static String [] generateTag(MetricUploadRequest request) {
        List<String> tags = new ArrayList<String>();
        tags.add( "application:" + request.getApplication().getName());
        AppDynamicsTier tier = request.getTier();
        tags.add("tier:" + tier.getTierName());
        tags.add("sources:AppDynamics");
        if (tier.getNodes() != null) {
            for (AppDynamicsNode node : tier.getNodes()) {
                tags.add("name:" + node.getMachineName());
                tags.add("kernel_name:" + node.getMachineOSType());
                tags.add("agentType:" + node.getAgentType());
            }
        }
        String [] tagsArr = new String [tags.size()];
        return tags.toArray(tagsArr);
    }

    public static JsonArray generateTagForBackendAsJsonArray(String metricPath, MetricUploadRequest request) {
        JsonArray tags = new JsonArray();
        String [] tagArr = generateTagForBackend(metricPath, request);
        for (String tag:tagArr) {
            tags.add(tag);
        }
        return tags;
    }

    public static JsonArray generateTagAsJsonArray(MetricUploadRequest request) {
        JsonArray tags = new JsonArray();
        String [] tagArr = generateTag( request);
        for (String tag:tagArr) {
            tags.add(tag);
        }
        return tags;
    }

    public static String getMetricPath(String path) {
        if (path.contains("Backend")) {
            return cleanupPathForBackend(path);
        } else if (path.contains("Advanced Network")) {
            return cleanupPathForNetwork(path);
        }   else {
            return  cleanupPath(path);
        }


    }

    public static String [] getTags(String metricPath, MetricUploadRequest request) {
        if (metricPath.contains("Backend")) {
            return generateTagForBackend(metricPath,request);
        }   else {
            return generateTag(request);
        }
    }


    public static JsonArray getTagsAsJsonArray(String metricPath, MetricUploadRequest request) {
        if (metricPath.contains("Backend")) {
            return generateTagForBackendAsJsonArray(metricPath,request);
        }   else {
            return generateTagAsJsonArray(request);
        }
    }


    public static String getHost(String merticPath, String [] tags) {
        if(merticPath.contains("Backend"))  {
            for (String tag: tags) {
                if (tag.indexOf("host:") != -1) {
                    return tag.substring(5);
                }
            }
        }   else {
            for (String tag: tags) {
                if (tag.indexOf("name:") != -1) {
                    return tag.substring(5);
                }
            }
        }
        return null;
    }


    public static String getType(String metricPath) {
        return "gauge";
    }

    public static JsonObject createDDMetric(String name, Float value, DomainSecurityInfo info) {
        JsonObject metricObj = new JsonObject();
        metricObj.addProperty("metric",name);
        JsonArray points = new JsonArray();
        JsonArray point = new JsonArray();
        point.add(System.currentTimeMillis()/1000);
        point.add(value);
        points.add(point);
        metricObj.add("points",points);
        metricObj.addProperty("type","gauge");
        metricObj.addProperty("host",info.getDomainName());
        JsonArray tags = new JsonArray();
        tags.add("source:cisco_umbrella");
        tags.add("application:store");
        tags.add("sourcecategory:security");

        if ((!"".equals(info.getAttack())) &&  (info.getAttack() != null)) {
            tags.add("attack:"  +  info.getAttack());
        }

        if ((!"".equals(info.getThreatType()) && (info.getThreatType()!= null))) {
            tags.add("threat_type:"  +  info.getThreatType());
        }

        if (info.isFound()!= null) {
            tags.add("found:" +info.isFound());
        }


        metricObj.add("tags",tags);
        return metricObj;
    }

    /*
    curl -i \
  --header  "Content-Type: application/json" \
  --header "X-SF-TOKEN: YOUR_ORG_ACCESS_TOKEN" \
  -X POST \
  -d \
  '{
  	"gauge": [{
    	"metric": "test.gauge",
      "value": 42,
      "dimensions": { "host": "testserver" }
    },
    {
    	"metric": "test.gauge.with_timestamp",
      "value": 42,
      "timestamp": 1485801354682,
      "dimensions": { "host": "testserver" }
    }],
    "counter": [{
    	"metric": "test.counter",
      "value": 1,
      "dimensions": { "host": "testserver" }
    }],
    "cumulative_counter": [{
    	"metric": "test.cumulative_counter",
      "value": 100,
      "dimensions": { "host": "testserver" }
    }]
  }' \
  https://ingest.signalfx.com/v2/datapoint
     */
    public static JsonObject createFXetric(List<DomainSecurityInfo> scoresList) {
        JsonObject datapoints = new JsonObject();
        JsonArray gauges  = new JsonArray();

        for (DomainSecurityInfo score:scoresList) {
            JsonObject dimensions = new JsonObject();
            dimensions.addProperty("source", "CiscoUmbrella");
            dimensions.addProperty("application", "store");
            dimensions.addProperty("category", "security");
            dimensions.addProperty("host", score.getDomainName());


            if ((!"".equals(score.getAttack())) && (score.getAttack() != null)) {
                dimensions.addProperty("attack", score.getAttack());
            }

            if ((!"".equals(score.getThreatType()) && (score.getThreatType() != null))) {
                dimensions.addProperty("threat_type", score.getThreatType());
            }

            if (score.isFound() != null) {
                dimensions.addProperty("found", score.isFound().toString());
            }

            JsonObject dgaPoint = new JsonObject();
            dgaPoint.addProperty("metric", "cisco.umbrella.dga_score");
            dgaPoint.addProperty("value", score.getDgaScore());
            dgaPoint.add("dimensions", dimensions);
            dgaPoint.addProperty("timestamp",System.currentTimeMillis());
            gauges.add(dgaPoint);

            JsonObject asnPoint = new JsonObject();
            asnPoint.addProperty("metric", "cisco.umbrella.asn_score");
            asnPoint.addProperty("value", score.getAsnScore());
            asnPoint.add("dimensions", dimensions);
            gauges.add(asnPoint);

            JsonObject geoPoint = new JsonObject();
            geoPoint.addProperty("metric", "cisco.umbrella.geo_score");
            geoPoint.addProperty("value", score.getGeoScore());
            geoPoint.add("dimensions", dimensions);
            gauges.add(geoPoint);

            JsonObject ksPoint = new JsonObject();
            ksPoint.addProperty("metric", "cisco.umbrella.ks_test");
            ksPoint.addProperty("value", score.getKsTest());
            ksPoint.add("dimensions", dimensions);
            gauges.add(ksPoint);

            JsonObject entropyPoint = new JsonObject();
            entropyPoint.addProperty("metric", "cisco.umbrella.entropy");
            entropyPoint.addProperty("value", score.getEntropy());
            entropyPoint.add("dimensions", dimensions);
            gauges.add(entropyPoint);

            JsonObject perplexityPoint = new JsonObject();
            perplexityPoint.addProperty("metric", "cisco.umbrella.perplexity");
            perplexityPoint.addProperty("value", score.getPerplexity());
            perplexityPoint.add("dimensions", dimensions);
            gauges.add(perplexityPoint);


            JsonObject popularityPoint = new JsonObject();
            popularityPoint.addProperty("metric", "cisco_umbrella.popularity");
            popularityPoint.addProperty("value", score.getPopularity());
            popularityPoint.add("dimensions", dimensions);
            gauges.add(popularityPoint);


            JsonObject pageRankPoint = new JsonObject();
            pageRankPoint.addProperty("metric", "cisco.umbrella.page_rank");
            pageRankPoint.addProperty("value", score.getPageRank());
            pageRankPoint.add("dimensions", dimensions);
            gauges.add(pageRankPoint);

            JsonObject prefixPoint = new JsonObject();
            prefixPoint.addProperty("metric", "cisco.umbrella.prefix_score");
            prefixPoint.addProperty("value", score.getPrefixScore());
            prefixPoint.add("dimensions", dimensions);
            gauges.add(prefixPoint);

            JsonObject secureRankPoint = new JsonObject();
            secureRankPoint.addProperty("metric", "cisco.umbrella.securerank_two");
            secureRankPoint.addProperty("value", score.getSecureRank2());
            secureRankPoint.add("dimensions", dimensions);
            gauges.add(secureRankPoint);


            JsonObject ripScorePoint = new JsonObject();
            ripScorePoint.addProperty("metric", "cisco.umbrella.rip_score");
            ripScorePoint.addProperty("value", score.getRipScore());
            ripScorePoint.add("dimensions", dimensions);
            gauges.add(ripScorePoint);

        }
            datapoints.add("gauge",gauges);
            return datapoints;
    }

    public static JsonObject createDDBTMetric(String metricName, long art,int cpm, int epm,String btname) {
        JsonObject timeSeries = new JsonObject();
        JsonArray series = new JsonArray();
        long timeInSec = System.currentTimeMillis()/1000;

        JsonObject artMertic = new JsonObject();
        JsonObject cpmMetric = new JsonObject();
        JsonObject epmMetric = new JsonObject();

        artMertic.addProperty("metric",metricName + ".average_response_time");
        JsonArray points = new JsonArray();
        JsonArray point = new JsonArray();
        point.add(timeInSec);
        point.add(art);
        points.add(point);
        artMertic.add("points",points);
        artMertic.addProperty("type","gauge");
        artMertic.addProperty("host","pm3.appdynamics.com");

        cpmMetric.addProperty("metric",metricName + ".calls_per_minute");
        JsonArray cpmPoints = new JsonArray();
        JsonArray cpmPoint = new JsonArray();
        cpmPoint.add(timeInSec);
        cpmPoint.add(cpm);
        cpmPoints.add(cpmPoint);
        cpmMetric.add("points",cpmPoints);
        cpmMetric.addProperty("type","gauge");
        cpmMetric.addProperty("host","pm3.appdynamics.com");

        epmMetric.addProperty("metric",metricName + ".errors_per_minute");
        JsonArray epmPoints = new JsonArray();
        JsonArray epmPoint = new JsonArray();
        epmPoint.add(timeInSec);
        epmPoint.add(epm);
        epmPoints.add(epmPoint);
        epmMetric.add("points",epmPoints);
        epmMetric.addProperty("type","gauge");
        epmMetric.addProperty("host","pm3.appdynamics.com");

        JsonArray tags = new JsonArray();
        tags.add("sources:appdynamics");
        tags.add("application:store");
        tags.add("sourcecategory:application");
        tags.add("tier:web_tier");
        tags.add("bt_name:" + btname);

        artMertic.add("tags",tags);
        cpmMetric.add("tags",tags);
        epmMetric.add("tags",tags);

        series.add(artMertic);
        series.add(cpmMetric);
        series.add(epmMetric);

        timeSeries.add("series",series);
        return timeSeries;
    }
}
