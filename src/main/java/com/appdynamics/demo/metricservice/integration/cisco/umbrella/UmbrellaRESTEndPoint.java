package com.appdynamics.demo.metricservice.integration.cisco.umbrella;

import com.appdynamics.demo.metricservice.integration.api.AbstractRESTEndpoint;

public class UmbrellaRESTEndPoint extends AbstractRESTEndpoint {
    private static final String endpoint = "https://investigate.api.umbrella.com";
    private String apiKey;

    public UmbrellaRESTEndPoint(String apiKey) {
        super(endpoint);
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
