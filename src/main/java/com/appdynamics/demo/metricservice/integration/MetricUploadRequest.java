package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MetricUploadRequest implements Serializable {
    private List<AppDynamicsMetric> metrics = new ArrayList<AppDynamicsMetric>();
    private Application application;
    private List<BusinessTransaction> bts = new ArrayList<BusinessTransaction>();;
    private List<AppDynamicsBackend> backends = new ArrayList<AppDynamicsBackend>();;
    private AppDynamicsTier tier;

    public MetricUploadRequest() {
        init();
    }

    private void init() {
        metrics = new ArrayList<AppDynamicsMetric>();
    }

    public List<AppDynamicsMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<AppDynamicsMetric> metrics) {
        this.metrics = metrics;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<BusinessTransaction> getBts() {
        return bts;
    }

    public void setBts(List<BusinessTransaction> bts) {
        this.bts = bts;
    }

    public void addMetrics(List<AppDynamicsMetric> metrics) {
        getMetrics().addAll(metrics);

    }

    public AppDynamicsTier getTier() {
        return tier;
    }

    public void setTier(AppDynamicsTier tier) {
        this.tier = tier;
    }

    public List<AppDynamicsBackend> getBackends() {
        return backends;
    }

    public void setBackends(List<AppDynamicsBackend> backends) {
        this.backends = backends;
    }

    public void addMetrics (Collection toAdd) {
        getMetrics().addAll(toAdd);
    }
}
