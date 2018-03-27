package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetric;
import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetricValue;
import com.google.gson.*;
import com.appdynamics.demo.metricservice.integration.model.Writer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.util.concurrent.BlockingQueue;


public class HttpMetricWriter implements JsonSerializer<MetricUploadRequest>, Writer {
    private String endpointURL = null;
    private BlockingQueue<MetricUploadRequest> queue = null;

    public HttpMetricWriter(String endPoint, BlockingQueue<MetricUploadRequest> queue) {
        this.endpointURL = endPoint;
        this.queue = queue;

    }

    public void write() {
        try {
            MetricUploadRequest request = queue.take();
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(MetricUploadRequest.class, this);
            Gson gson = gsonBuilder.create();
            String json = gson.toJson(request);
            postMetrics(json);

        } catch (Exception ie) {
            ie.printStackTrace();
        }

    }
    
    public void postMetrics(String json) {
            Client client = ClientBuilder.newClient();
            Response response = client.target(this.endpointURL).request().post(Entity.json(json));
            System.out.println("Response:" + response.getStatus());
    }
    

    @Override
    public synchronized JsonElement serialize(MetricUploadRequest metricUploadRequest, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject series = new JsonObject();
        JsonArray metricArray =  new JsonArray();
        for (AppDynamicsMetric metric: metricUploadRequest.getMetrics()) {
            if (metric.getMetricValues().size() > 0) {
                String metricPath = metric.getMetricPath();
                JsonObject metricInst = new JsonObject();
                JsonArray points = new JsonArray();
                JsonArray point = new JsonArray();
                AppDynamicsMetricValue value = metric.getMetricValues().get(0);
                point.add((int)(value.getStartTimeInMillis()/1000));
                point.add(value.getValue());
                points.add(point);
                metricInst.add("points", points);
                String[] tags = MetricWriterUtils.getTags(metricPath, metricUploadRequest);
                metricInst.addProperty("host", MetricWriterUtils.getHost(metricPath, tags));
                metricInst.addProperty("metric", MetricWriterUtils.getMetricPath(metricPath));
                metricInst.addProperty("type",MetricWriterUtils.getType(metricPath));
                metricInst.add("tags", MetricWriterUtils.getTagsAsJson(metricPath, metricUploadRequest));
                metricArray.add(metricInst);
            }
        }
        series.add("series",metricArray);
        return series;
    }
}
