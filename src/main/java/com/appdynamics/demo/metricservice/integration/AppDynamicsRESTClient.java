package com.appdynamics.demo.metricservice.integration;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class AppDynamicsRESTClient {
    private AppDynamicsControllerEndpoint endpoint;

    public AppDynamicsRESTClient(AppDynamicsControllerEndpoint endpoint) {
        this.endpoint = endpoint;
    }



    public Client getClient() {
        Client client = ClientBuilder.newClient();
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.universalBuilder()
                .credentialsForBasic(endpoint.getUsername(), endpoint.getPassword())
                .credentials(endpoint.getUsername(), endpoint.getPassword())
                .build();
        client.register(feature);
        return client;
    }
}
