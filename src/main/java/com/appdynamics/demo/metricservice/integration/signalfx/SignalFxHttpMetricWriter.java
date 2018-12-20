package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.api.AbstractHttpMerticWriter;
import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetric;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Logger;

public class SignalFxHttpMetricWriter extends AbstractHttpMerticWriter {
    private static final Logger logger  = Logger.getLogger(SignalFxHttpMetricWriter.class.getName());

    public SignalFxHttpMetricWriter(String endPoint, String apiKey) {
        super(endPoint,apiKey);
    }

    @Override
    protected Invocation.Builder getRequest() {
        return super.getRequest().header("X-SF-TOKEN",getApiKey()).header("Content-Type",MediaType.APPLICATION_JSON_TYPE);
    }

    @Override
    public JsonElement serialize(MetricUploadRequest metricUploadRequest, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject fxMetricList = new JsonObject();
        List<AppDynamicsMetric> metrics = metricUploadRequest.getMetrics();
        JsonArray metricList = new JsonArray();
        for (AppDynamicsMetric metric:metrics) {
            if (metric.getMetricValues().size() > 0) {
                String metricPath = metric.getMetricPath();
                JsonObject fxMetric = new JsonObject();
                fxMetric.addProperty("metric", MetricWriterUtils.getMetricPath(metricPath));
                JsonObject dimensions = new JsonObject();
                JsonObject tag = new JsonObject();
                fxMetric.addProperty("value", metric.getMetricValues().get(0).getValue());
                String[] tags = MetricWriterUtils.getTags(metricPath, metricUploadRequest);
                fxMetric.addProperty("host", MetricWriterUtils.getHost(metricPath, tags));
                JsonArray tagArray = MetricWriterUtils.getTagsAsJsonArray(metricPath, metricUploadRequest);
                fxMetric.add("dimensions", MetricWriterUtils.toJsonObject(tagArray));
                fxMetric.addProperty("timestamp",metric.getMetricValues().get(0).getStartTimeInMillis());
                metricList.add(fxMetric);
            }
            fxMetricList.add("gauge",metricList);
        }
        return fxMetricList;
    }
}
