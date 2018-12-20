package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.appdynamics.model.*;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class MetricUploadRequest implements Serializable {
    private List<AppDynamicsMetric> metrics = new ArrayList<AppDynamicsMetric>();
    private Application application;
    private List<BusinessTransaction> bts = new ArrayList<BusinessTransaction>();;
    private List<AppDynamicsBackend> backends = new ArrayList<AppDynamicsBackend>();;
    private AppDynamicsTier tier;
    private List<AppDynamicsTier> tiers = new ArrayList<AppDynamicsTier>();

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

    public Map<String, AppDynamicsBackend> getBackendMap() {
//        Map<String, AppDynamicsBackend> map =
//                getBackends().stream().collect(Collectors.toMap(AppDynamicsBackend::getKey, item -> item));
//        return map;
        Map<String, AppDynamicsBackend> map = new HashMap<String, AppDynamicsBackend>();
        //truncated names so we will duplicate
        for (AppDynamicsBackend backend:getBackends()) {
            map.put(backend.getName(),backend);
        }
        return map;
    }

    public Map<String, BusinessTransaction> getBusinessTransactionMap() {
        Map<String, BusinessTransaction> map =
                getBts().stream().collect(Collectors.toMap(BusinessTransaction::getKey, item -> item));
        return map;

    }

    public Map<String, AppDynamicsTier> getTiersMap() {
        Map<String, AppDynamicsTier> map =
                getTiers().stream().collect(Collectors.toMap(AppDynamicsTier::getKey, item -> item));
        return map;

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
    public List<AppDynamicsTier> getTiers() {
        return tiers;
    }

    public void setTiers(List<AppDynamicsTier> tiers) {
        this.tiers = tiers;
    }
}
