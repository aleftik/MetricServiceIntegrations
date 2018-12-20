package com.appdynamics.demo.metricservice.integration.cisco.umbrella.model;


import java.util.List;
import java.util.Objects;


public class DomainSecurityInfo {

    private Float dgaScore;
    private Float perplexity;
    private Float entropy;
    private Float secureRank2;
    private Float pageRank;
    private Float asnScore;
    private Float prefixScore;
    private Float ripScore;
    private Float popularity;
    private Float geoScore;
    private Float ksTest;
    private String attack;
    private String threatType;
    private Boolean found;
    private String domainName;

    private List<Geodiversity> geodiversity;

    private List<Geodiversity> noramlizedGeodiversity;

    private List<Geodiversity> tldGeodiversity;


    public DomainSecurityInfo(){}

    public Float getDgaScore() {
        return dgaScore;
    }

    public void setDgaScore(Float dgaScore) {
        this.dgaScore = dgaScore;
    }

    public Float getPerplexity() {
        return perplexity;
    }

    public void setPerplexity(Float perplexity) {
        this.perplexity = perplexity;
    }

    public Float getEntropy() {
        return entropy;
    }

    public void setEntropy(Float entropy) {
        this.entropy = entropy;
    }

    public Float getSecureRank2() {
        return secureRank2;
    }

    public void setSecureRank2(Float secureRank2) {
        this.secureRank2 = secureRank2;
    }

    public Float getPageRank() {
        return pageRank;
    }

    public void setPageRank(Float pageRank) {
        this.pageRank = pageRank;
    }

    public Float getAsnScore() {
        return asnScore;
    }

    public void setAsnScore(Float asnScore) {
        this.asnScore = asnScore;
    }

    public Float getPrefixScore() {
        return prefixScore;
    }

    public void setPrefixScore(Float prefixScore) {
        this.prefixScore = prefixScore;
    }

    public Float getRipScore() {
        return ripScore;
    }

    public void setRipScore(Float ripScore) {
        this.ripScore = ripScore;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public Float getGeoScore() {
        return geoScore;
    }

    public void setGeoScore(Float geoScore) {
        this.geoScore = geoScore;
    }

    public Float getKsTest() {
        return ksTest;
    }

    public void setKsTest(Float ksTest) {
        this.ksTest = ksTest;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    public Boolean isFound() {
        return found;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
