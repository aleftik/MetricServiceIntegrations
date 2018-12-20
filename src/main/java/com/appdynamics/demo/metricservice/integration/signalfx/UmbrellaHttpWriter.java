package com.appdynamics.demo.metricservice.integration.signalfx;

import com.appdynamics.demo.metricservice.integration.MetricWriterUtils;
import com.appdynamics.demo.metricservice.integration.api.AbstractHttpWriter;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.model.DomainSecurityInfo;
import com.google.gson.*;
import rook.com.google.api.Metric;

import java.util.List;


public class UmbrellaHttpWriter extends AbstractSignalFXWriter {


    public UmbrellaHttpWriter(String endPoint, String apiKey) {
        super(endPoint,apiKey);
    }

    public void write(List<DomainSecurityInfo> domainSecurityInfo) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson  = builder.setPrettyPrinting().create();
        String json = gson.toJson(serialize(domainSecurityInfo));
        postMetrics(json,false);
    }

    public JsonElement serialize(List<DomainSecurityInfo> domainSecurityInfoList) {
        return MetricWriterUtils.createFXetric(domainSecurityInfoList);
    }
}
