package com.appdynamics.demo.metricservice.integration;

public class AppDynamicsEventServiceEndpoint extends AbstractAppDynamicsRESTEndpoint {

    private String accountKey;
    private String apiKey;

    public AppDynamicsEventServiceEndpoint(String host, String accountKey, String apiKey) {
        super(host);
        this.accountKey = accountKey;
        this.apiKey = apiKey;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
