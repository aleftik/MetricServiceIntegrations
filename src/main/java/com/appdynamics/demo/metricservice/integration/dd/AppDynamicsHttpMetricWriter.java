package com.appdynamics.demo.metricservice.integration.dd;

import com.appdynamics.demo.metricservice.integration.MetricWriterUtilsV2;
import com.appdynamics.demo.metricservice.integration.MetricUploadRequest;
import com.appdynamics.demo.metricservice.integration.api.AbstractHttpMerticWriter;

import com.google.gson.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import java.lang.reflect.Type;


public class AppDynamicsHttpMetricWriter extends AbstractHttpMerticWriter {


    public AppDynamicsHttpMetricWriter(String endPoint, String apiKey) {
       super(endPoint,apiKey,false);
    }

    protected Invocation.Builder getRequest() {
        Client client = ClientBuilder.newClient();
        return client.target(getEndpointURL()+"?api_key="+getApiKey()).request();
    }

    @Override
    public JsonElement serialize(MetricUploadRequest metricUploadRequest, Type typeOfSrc, JsonSerializationContext context) {
        return MetricWriterUtilsV2.createSeries(metricUploadRequest,false);
    }
}
