package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetric;
import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetricValue;
import com.google.gson.*;

import java.lang.reflect.Type;


public class DataDogHttpMetricWriter extends AbstractHttpMerticWriter  {


    public DataDogHttpMetricWriter(String endPoint, String apiKey) {
       super(endPoint,apiKey);
    }
    

    @Override
    public JsonElement serialize(MetricUploadRequest metricUploadRequest, Type typeOfSrc, JsonSerializationContext context) {
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
                metricInst.add("tags", MetricWriterUtils.getTagsAsJsonArray(metricPath, metricUploadRequest));
                metricArray.add(metricInst);
            }
        }
        series.add("series",metricArray);
        return series;
    }
}
