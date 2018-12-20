package com.appdynamics.demo.metricservice.integration.api;


import com.appdynamics.demo.metricservice.integration.MetricUploadRequest;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractHttpMerticWriter extends AbstractHttpWriter implements JsonSerializer<MetricUploadRequest>, MetricWriter {
    private Logger logger = Logger.getLogger(AbstractHttpMerticWriter.class.getName());


    public AbstractHttpMerticWriter(String endPoint, String apiKey, boolean doPut) {
        super(endPoint,apiKey, doPut);
    }


    public void write(MetricUploadRequest request) {
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            gsonBuilder.registerTypeAdapter(MetricUploadRequest.class, this);
            Gson gson = gsonBuilder.create();
            String json = gson.toJson(request);
            logger.log(Level.FINEST,json);
            postMetrics(json, doPut);
        } catch (Exception ie) {
            logger.log(Level.SEVERE,"Error Writing Http Metrics",ie);
            ie.printStackTrace();
        }

    }

    public abstract JsonElement serialize(MetricUploadRequest metricUploadRequest, Type typeOfSrc, JsonSerializationContext context);
}
