package com.appdynamics.demo.datadog.integration;

import java.io.IOException;
import java.net.DatagramPacket;

import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.concurrent.Executors;

public class StatsDServer {
    private static int BUF_SIZE = 8*1024;
    private byte [] buf = new byte[BUF_SIZE];

    public static void main(String [] args) {
        if (args.length < 1) {
            System.out.println("need a port");
            System.exit(0);
        }
        try {
            new StatsDServer().listen(Integer.parseInt(args[0]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public void listen(int port) throws IOException {
        DatagramSocket socket = new DatagramSocket(port);
        socket.setReceiveBufferSize(BUF_SIZE);
        StringBuffer completePayload = new StringBuffer();
        while (true) {
            String message = null;
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            byte[] payload = packet.getData();
            message = new String(payload,0,packet.getLength(),"UTF-8");
            if (message.indexOf('\n') != -1) {
                System.out.println("found a new ln");
            }
            System.out.print(message);
        }
        
    }
}
