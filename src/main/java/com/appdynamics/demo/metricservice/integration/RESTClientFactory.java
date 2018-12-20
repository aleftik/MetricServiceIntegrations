package com.appdynamics.demo.metricservice.integration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import com.appdynamics.demo.metricservice.integration.api.AbstractRESTEndpoint;
import com.appdynamics.demo.metricservice.integration.api.TimeConstants;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsControllerEndpoint;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsEventServiceEndpoint;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.UmbrellaRESTEndPoint;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import java.io.IOException;

public class RESTClientFactory {
    private static final String ACCOUNT_KEY_HEADER ="X-Events-API-AccountName";
    private static final String UMBRELLA_HEADER ="Authorization";
    private static final String API_KEY_HEADER = "X-Events-API-Key";
    private static final RESTClientFactory instance = new RESTClientFactory();

    protected static ClientConfig clientConfig = null;

    static {
        clientConfig = new ClientConfig();
        clientConfig.property(ClientProperties.READ_TIMEOUT, TimeConstants.TWO_MINUTES);
        clientConfig.property(ClientProperties.CONNECT_TIMEOUT, TimeConstants.TWENTY_SECONDS);
        PoolingHttpClientConnectionManager connectionManager =
                new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(1024);
        connectionManager.setDefaultMaxPerRoute(1024);
        clientConfig.property(ApacheClientProperties.CONNECTION_MANAGER, connectionManager);
        clientConfig.property(ApacheClientProperties.CONNECTION_MANAGER_SHARED, true);
        clientConfig.connectorProvider(new ApacheConnectorProvider());
    }

    private RESTClientFactory() {

    }

    public static Client create(AbstractRESTEndpoint endpoint) {
        if (endpoint instanceof AppDynamicsControllerEndpoint)  {
            return getControllerClient((AppDynamicsControllerEndpoint) endpoint);
        } else if (endpoint instanceof AppDynamicsEventServiceEndpoint) {
            return getEventServiceClient((AppDynamicsEventServiceEndpoint) endpoint);
        } else if (endpoint instanceof UmbrellaRESTEndPoint) {
            return getUmbrellaClient((UmbrellaRESTEndPoint) endpoint);
        }
        throw new IllegalArgumentException("Cannot handle a subclass of type" + endpoint.getClass().getName());
    }

    private static Client getUmbrellaClient(UmbrellaRESTEndPoint endpoint) {
        Client client = ClientBuilder.newClient(clientConfig);
        client.register(new ClientRequestFilter() {
            @Override
            public void filter(ClientRequestContext requestContext) throws IOException {
                requestContext.getHeaders().add(UMBRELLA_HEADER,"Bearer " + ((UmbrellaRESTEndPoint)endpoint).getApiKey());
            }
        });
        return client;
    }


    private static Client getControllerClient(AppDynamicsControllerEndpoint endpoint) {
        Client client = ClientBuilder.newClient(RESTClientFactory.clientConfig);
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.universalBuilder()
                .credentialsForBasic(endpoint.getUsername(), endpoint.getPassword())
                .credentials(endpoint.getUsername(), endpoint.getPassword())
                .build();
        client.register(feature);
        return client;
    }

    private static Client getEventServiceClient(AppDynamicsEventServiceEndpoint eventServiceEndpoint) {
        Client client = ClientBuilder.newClient(RESTClientFactory.clientConfig);
        client.register(new ClientRequestFilter() {
            @Override
            public void filter(ClientRequestContext requestContext) throws IOException {
                requestContext.getHeaders().add(ACCOUNT_KEY_HEADER,eventServiceEndpoint.getAccountKey());
                requestContext.getHeaders().add(API_KEY_HEADER,eventServiceEndpoint.getApiKey());
            }
        });
        return client;
    }
}
