package com.appdynamics.demo.metricservice.integration.dd;

import com.appdynamics.demo.metricservice.integration.MetricWriterUtils;
import com.appdynamics.demo.metricservice.integration.api.AbstractHttpWriter;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.model.DomainSecurityInfo;
import com.google.gson.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import java.util.List;

public class UmbrellaHttpWriter extends AbstractHttpWriter {
    private List<DomainSecurityInfo> domainSecurityInfo = null;

    public UmbrellaHttpWriter(String endPoint, String apiKey) {
        super(endPoint,apiKey,false);
    }

    public void write(List<DomainSecurityInfo> domainSecurityInfo) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson  = builder.create();
        String json = gson.toJson(serialize(domainSecurityInfo));
        postMetrics(json,false);
    }

    @Override
    protected Invocation.Builder getRequest() {
        Client client = ClientBuilder.newClient();
        return client.target(getEndpointURL()+"?api_key="+getApiKey()).request();
    }


    public JsonElement serialize(List<DomainSecurityInfo> domainSecurityInfoList) {
        JsonObject series = new JsonObject();
        JsonArray metricArray =  new JsonArray();
        for (DomainSecurityInfo domainSecurityInfo:domainSecurityInfoList) {
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.dga_score", domainSecurityInfo.getDgaScore(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.asn_score", domainSecurityInfo.getAsnScore(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.entropy", domainSecurityInfo.getEntropy(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.geoscore", domainSecurityInfo.getGeoScore(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.ks_test", domainSecurityInfo.getKsTest(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.perplexity", domainSecurityInfo.getPerplexity(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.popularity", domainSecurityInfo.getPopularity(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.page_rank", domainSecurityInfo.getPageRank(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.prefix_score", domainSecurityInfo.getPrefixScore(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.securerank2", domainSecurityInfo.getSecureRank2(), domainSecurityInfo));
            metricArray.add(MetricWriterUtils.createDDMetric("cisco_umbrella.rip_score", domainSecurityInfo.getRipScore(), domainSecurityInfo));
        }
        series.add("series",metricArray);
        return series;
    }
}
