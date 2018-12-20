package com.appdynamics.demo.metricservice.integration.model.umbrella;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Geodiversity {
    private String countyCode;
    private Float score;
    public Geodiversity() {}

    public Geodiversity(String countyCode, Float score) {
        this.countyCode = countyCode;
        this.score = score;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
