package com.appdynamics.demo.metricservice.integration;

import org.eclipse.jetty.server.Server;
public class JettyWebServer implements Runnable {
    private String endPoint;
    private String apiKey;

    private String fxEndPoint;
    private String fxApiKey;


    private int port;

    public JettyWebServer(String endPoint,String apiKey, String fxEndPoint, String fxApiKey,int port) {
        this.endPoint = endPoint;
        this.port = port;
        this.apiKey = apiKey;
        this.fxEndPoint = fxEndPoint;
        this.fxApiKey = fxApiKey;
    }

    @Override
    public void run() {
        Server server = new Server(port);
        server.setHandler(new AnamolyHandler(endPoint,apiKey,fxEndPoint,fxApiKey));
        try {
            server.start();
            server.dumpStdErr();
            server.join();
        } catch ( Exception ex) {
            ex.printStackTrace();
        }
    }
}
