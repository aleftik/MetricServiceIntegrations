package com.appdynamics.demo.metricservice.integration;

public abstract class AbstractAppDynamicsRESTEndpoint {
    private String host = null;
    public AbstractAppDynamicsRESTEndpoint(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}
