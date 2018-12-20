package com.appdynamics.demo.metricservice.integration.api;

public abstract class AbstractRESTEndpoint {
    private String host = null;
    public AbstractRESTEndpoint(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}
