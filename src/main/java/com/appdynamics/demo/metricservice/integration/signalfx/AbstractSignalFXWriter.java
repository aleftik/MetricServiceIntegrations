package com.appdynamics.demo.metricservice.integration.signalfx;

import com.appdynamics.demo.metricservice.integration.api.AbstractHttpWriter;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;

public class AbstractSignalFXWriter extends AbstractHttpWriter {

    public AbstractSignalFXWriter(String endPoint, String apiKey) {
        super(endPoint,apiKey,false);
    }

    @Override
    protected Invocation.Builder getRequest() {
        return super.getRequest().header("X-SF-TOKEN",getApiKey()).header("Content-Type", MediaType.APPLICATION_JSON_TYPE);
    }
}
