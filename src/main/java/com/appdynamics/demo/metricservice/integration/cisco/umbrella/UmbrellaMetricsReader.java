package com.appdynamics.demo.metricservice.integration.cisco.umbrella;

import com.appdynamics.demo.metricservice.integration.EventUploadRequest;
import com.appdynamics.demo.metricservice.integration.RESTClientFactory;
import com.appdynamics.demo.metricservice.integration.api.Reader;
import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsBrowserEvent;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.model.DomainSecurityInfo;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

public class UmbrellaMetricsReader implements Reader,JsonDeserializer<DomainSecurityInfo> {
    private static final Logger logger = Logger.getLogger(UmbrellaMetricsReader.class.getName());
    private EventUploadRequest browserEvents = null;
    private UmbrellaRESTEndPoint endpoint = null;
    private Gson gson = null;
    private List<DomainSecurityInfo> result;

    public UmbrellaMetricsReader(UmbrellaRESTEndPoint endpoint, EventUploadRequest browserEvents) {
        this.browserEvents = browserEvents;
        this.endpoint = endpoint;
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(DomainSecurityInfo.class,this);
        gson = builder.create();
    }

    public List<DomainSecurityInfo> getResult() {
        return result;
    }

    @Override
    public void read() {
        HashSet<String> listToScore = new HashSet<String>();
        result = new ArrayList<DomainSecurityInfo>();

        for(AppDynamicsBrowserEvent event: browserEvents.getEvents()) {
            String url = event.getPageurl();
            String domainName = null;
            if (url !=null) {
                URL pageURL = null;
                try {
                    pageURL = new URL(url);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                 if (pageURL != null) {
                     domainName = pageURL.getHost();
                    listToScore.add(domainName);
                 }
            }

        }

        for (String host: listToScore) {
            result.add(scoreDomain(host));
        }
    }

    public DomainSecurityInfo scoreDomain(String domainName) {
        Client client =  RESTClientFactory.create(endpoint);
        DomainSecurityInfo domainSecurityInfo = null;
        Response response = client.target(endpoint.getHost() + "/security/name/" + domainName).request().get();
        if (response.getStatus() == 200) {
            String jsonString = response.readEntity(String.class);
            domainSecurityInfo = gson.fromJson(jsonString,DomainSecurityInfo.class);
            domainSecurityInfo.setDomainName(domainName);
        } else {
            logger.severe("Got a bad response from umbrella investiage api:" + response.getStatus());
        }
        return domainSecurityInfo;
    }

    @Override
    public DomainSecurityInfo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        DomainSecurityInfo info = new DomainSecurityInfo();
        JsonObject infoJson = (JsonObject) json;
        info.setDgaScore(infoJson.getAsJsonPrimitive("dga_score").getAsFloat());
        info.setPerplexity(infoJson.getAsJsonPrimitive("perplexity").getAsFloat());
        info.setPageRank(infoJson.getAsJsonPrimitive("pagerank").getAsFloat());
        info.setEntropy(infoJson.getAsJsonPrimitive("entropy").getAsFloat());
        info.setSecureRank2(infoJson.getAsJsonPrimitive("securerank2").getAsFloat());
        info.setAsnScore(infoJson.getAsJsonPrimitive("asn_score").getAsFloat());
        info.setRipScore(infoJson.getAsJsonPrimitive("rip_score").getAsFloat());
        info.setPopularity(infoJson.getAsJsonPrimitive("popularity").getAsFloat());
        info.setFound(infoJson.getAsJsonPrimitive("found").getAsBoolean());
        info.setGeoScore(infoJson.getAsJsonPrimitive("geoscore").getAsFloat());
        info.setKsTest(infoJson.getAsJsonPrimitive("ks_test").getAsFloat());
        info.setAttack(infoJson.getAsJsonPrimitive("attack").getAsString());
        info.setThreatType(infoJson.getAsJsonPrimitive("threat_type").getAsString());
        return info;
    }


}
