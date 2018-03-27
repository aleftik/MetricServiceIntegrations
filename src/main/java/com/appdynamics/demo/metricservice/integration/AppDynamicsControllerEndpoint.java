package com.appdynamics.demo.metricservice.integration;

public class AppDynamicsControllerEndpoint {
    private String username;
    private String password;
    private String host;

    public AppDynamicsControllerEndpoint(String host, String username, String password) {
        this.username = username;
        this.password = password;
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }
}
