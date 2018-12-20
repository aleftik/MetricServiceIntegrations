package com.appdynamics.demo.metricservice.integration.appdynamics;

import com.appdynamics.demo.metricservice.integration.api.AbstractRESTEndpoint;

public class AppDynamicsControllerEndpoint extends AbstractRESTEndpoint {
    private String username;
    private String password;

    public AppDynamicsControllerEndpoint(String host, String username, String password) {
        super(host);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
