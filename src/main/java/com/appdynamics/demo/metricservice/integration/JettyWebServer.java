package com.appdynamics.demo.metricservice.integration;

import org.eclipse.jetty.server.Server;
public class JettyWebServer implements Runnable {
    private String endPoint;
    private int port;

    public JettyWebServer(String endPoint, int port) {
        this.endPoint = endPoint;
        this.port = port;
    }

    @Override
    public void run() {
        Server server = new Server(port);
        server.setHandler(new AnamolyHandler(endPoint));
        try {
            server.start();
            server.dumpStdErr();
            server.join();
        } catch ( Exception ex) {
            ex.printStackTrace();
        }
    }
}
