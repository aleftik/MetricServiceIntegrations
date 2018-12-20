package com.appdynamics.demo.metricservice.integration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsControllerEndpoint;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsEventServiceEndpoint;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import java.io.IOException;

public class AppDynamicsRESTClientFactory {
    private static final String ACCOUNT_KEY_HEADER ="X-Events-API-AccountName";
    private static final String API_KEY_HEADER = "X-Events-API-Key";
    private static final AppDynamicsRESTClientFactory instance = new AppDynamicsRESTClientFactory();

    private AppDynamicsRESTClientFactory() {
    }

    public static Client create(AbstractAppDynamicsRESTEndpoint endpoint) {
        if (endpoint instanceof AppDynamicsControllerEndpoint)  {
            return getControllerClient((AppDynamicsControllerEndpoint) endpoint);
        } else if (endpoint instanceof AppDynamicsEventServiceEndpoint) {
            return getEventServiceClient((AppDynamicsEventServiceEndpoint) endpoint);
        }
        throw new IllegalArgumentException("Cannot handle a subclass of type" + endpoint.getClass().getName());
    }



    private static Client getControllerClient(AppDynamicsControllerEndpoint endpoint) {
        Client client = ClientBuilder.newClient();
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.universalBuilder()
                .credentialsForBasic(endpoint.getUsername(), endpoint.getPassword())
                .credentials(endpoint.getUsername(), endpoint.getPassword())
                .build();
        client.register(feature);
        return client;
    }

    private static Client getEventServiceClient(AppDynamicsEventServiceEndpoint eventServiceEndpoint) {
        Client client = ClientBuilder.newClient();
        client.register(new ClientRequestFilter() {
            @Override
            public void filter(ClientRequestContext requestContext) throws IOException {
                requestContext.getHeaders().add(ACCOUNT_KEY_HEADER,eventServiceEndpoint.getAccountKey());
                requestContext.getHeaders().add(API_KEY_HEADER,eventServiceEndpoint.getApiKey());
//                requestContext.getHeaders().add("Content-type","application/vnd.appd.events+text;v=2");
            }
        });
        return client;
    }
}
