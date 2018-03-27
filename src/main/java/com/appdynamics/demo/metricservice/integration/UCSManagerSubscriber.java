package com.appdynamics.demo.metricservice.integration;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class UCSManagerSubscriber implements Runnable {
    private HttpClient client;
    private String endpoint;
    private String cookie;


    public UCSManagerSubscriber(String endpoint) {
        this.endpoint = endpoint;
    }


    @Override
    public void run() {
        try {
            setCookie(login());
            createRefresh();
            registerForEvents();
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }

    private void createRefresh() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        sendHB();
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void registerForEvents() throws IOException,Exception {
        HttpURLConnection connection = (HttpURLConnection)new URL(getEndpoint()).openConnection();
        connection.setRequestMethod("POST");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
        writer.write(("<eventSubscribe cookie=\"" + getCookie() + "\"><inFilter/></eventSubscribe>").getBytes());
        writer.flush();
        writer.close();
        int code = connection.getResponseCode();
//        InputStream in = connection.getInputStream();
//        List<String> lines = null;
//        while ((lines = IOUtils.readLines(in,"UTF-8")) != null) {
//            processEvent(lines);
//        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (Character.isDigit(inputLine.charAt(0))) {
                
            } else {
                processEvent(inputLine);
            }

        }


    }

    private void processEvent(String event) throws Exception {
//        System.out.println(event);
//        if (event.startsWith("<aaaRefresh")) {
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(event.getBytes()));
//            setCookie(doc.getDocumentElement().getAttribute("outCookie"));
//        }  else {
//
//        }
    }


    private void sendHB() throws IOException,ParserConfigurationException,SAXException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(getEndpoint());
        String refreshCommand = "<aaaRefresh inCookie=\"" + getCookie() + "\"/>";
        post.setEntity(EntityBuilder.create().setContentType(ContentType.APPLICATION_FORM_URLENCODED).setText(refreshCommand).build());
        HttpResponse response = client.execute(post);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = dbf.newDocumentBuilder().parse(response.getEntity().getContent());
        setCookie(doc.getDocumentElement().getAttribute("outCookie"));
        try {
            Thread.currentThread().sleep(120*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public String login() throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost loginPost = new HttpPost(getEndpoint());
        com.appdynamics.demo.metricservice.integration.ucs.in.AaaLogin loginInput = new com.appdynamics.demo.metricservice.integration.ucs.in.AaaLogin();
        loginInput.setInName("apiuser");
        loginInput.setInPassword("apiuser");
        loginPost.setEntity(marshall(new com.appdynamics.demo.metricservice.integration.ucs.in.AaaLogin()));
        HttpResponse response = client.execute(loginPost);
        HttpEntity responseEntity = response.getEntity();
        return unMarshall(responseEntity);
    }

    private String unMarshall(HttpEntity entity) throws IOException {
        try {
            JAXBContext context = JAXBContext.newInstance(com.appdynamics.demo.metricservice.integration.ucs.out.AaaLogin.class);
            StringWriter writer = new StringWriter();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document doc = dbf.newDocumentBuilder().parse(entity.getContent());
            return  doc.getDocumentElement().getAttribute("outCookie");
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (ParserConfigurationException cfe) {
            cfe.printStackTrace();
        } catch (JAXBException jaxbe) {
            jaxbe.printStackTrace();
        }
        return null;
    }

    private HttpEntity marshall(com.appdynamics.demo.metricservice.integration.ucs.in.AaaLogin login) {
        try {
            JAXBContext context = JAXBContext.newInstance(com.appdynamics.demo.metricservice.integration.ucs.in.AaaLogin.class);
            StringWriter writer = new StringWriter();
            writer.append("<aaaLogin inName=\"ucspe\" inPassword=\"ucspe\" />");
            return EntityBuilder.create().setContentType(ContentType.APPLICATION_FORM_URLENCODED).setText(writer.toString()).build();
        } catch(JAXBException jaxbe) {
            jaxbe.printStackTrace();
        }
        return  null;
    }

    public HttpClient getClient() {
        return client;
    }

    public void setClient(HttpClient client) {
        this.client = client;
    }

    public String getEndpoint() {
        return endpoint;
    }


    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
}
