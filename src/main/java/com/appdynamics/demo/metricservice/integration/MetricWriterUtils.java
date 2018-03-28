package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.AppDynamicsBackend;
import com.appdynamics.demo.metricservice.integration.model.AppDynamicsNode;
import com.appdynamics.demo.metricservice.integration.model.AppDynamicsTier;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.json.Json;
import java.util.ArrayList;
import java.util.Iterator;
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
        for (AppDynamicsNode node:tier.getNodes()) {
            tags.add("name:" + node.getMachineName());
            tags.add("kernel_name:" + node.getMachineOSType());
            tags.add("agentType:" + node.getAgentType());
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

    public static JsonObject toJsonObject(JsonArray array) {
        JsonObject obj = new JsonObject();
        Iterator it = array.iterator();
        while (it.hasNext()) {
            JsonElement tag = (JsonElement) it.next();
            String[] parts = tag.toString().split(":");
            obj.addProperty(parts[0],parts[1]);
        }
        return obj;
    }

    public static String getType(String metricPath) {
        return "gauge";
    }
}
