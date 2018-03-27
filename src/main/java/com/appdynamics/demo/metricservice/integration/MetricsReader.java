package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.*;



import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetricsReader {
    private static Logger logger = Logger.getLogger(MetricsReader.class.getName());
    private boolean continueRunning = true;
    private AppDynamicsControllerEndpoint endpoint;
    private BlockingQueue<MetricUploadRequest> queue;

    public MetricsReader(AppDynamicsControllerEndpoint endpoint, BlockingQueue<MetricUploadRequest> queue) {
        this.endpoint = endpoint;
        this.queue = queue;
    }

    public void read() {
        List<Application> apps = getApplications();
        for (Application app:apps) {
            MetricUploadRequest request = new MetricUploadRequest();
            request.setApplication(app);
            List<AppDynamicsBackend> backends = readBackends(app);
            List<Tier> tiers = readTiers(app);
            for (Tier tier: tiers) {
                List<AppDynamicsMetric> metrics = readNetworkMetrics(app,tier);
                request.addMetrics(metrics);
            }
            request.setBackends(backends);
            List<AppDynamicsMetric> backendMetrics = readBackendMetrics(app.getName());
            request.addMetrics(backendMetrics);
            List<BusinessTransaction> bts  = readBTsForApp(app);
            request.setBts(bts);
            for (BusinessTransaction bt: bts) {
                request.setTier(findTier(bt,app));
                List<AppDynamicsMetric> metrics = readBTMetrics(app.getName(), bt);
                request.addMetrics(metrics);
            }
            try {
                queue.put(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private List<AppDynamicsMetric> readNetworkMetrics(Application app,Tier tier) {
        String metricPath = metricPathForNetwork(app.getName(),tier.getName());
        List<AppDynamicsMetric> metrics = new ArrayList<AppDynamicsMetric>();
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + metricPath).request().get();
            if (response.getStatus() == 200) {
                metrics = response.readEntity(new GenericType<List<AppDynamicsMetric>>() {
                });
                return metrics;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve backend metrics",ex);
        }
        return null;
    }

    private String metricPathForNetwork(String appName, String tierName) {
        String path = "/controller/rest/applications/" + URLEncoder.encode(appName) + "/metric-data?metric-path=" + "Application%20Infrastructure%20Performance%7C" + URLEncoder.encode(tierName) +   "%7CAdvanced%20Network%7CFlows%7C*%7C*" + "&time-range-type=BEFORE_NOW&duration-in-mins=1";
        return path;
    }

    private List<Tier> readTiers(Application app) {
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        List<Tier> tiers = new ArrayList<>();
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + "/controller/rest/applications/" + app.getId()+ "/tiers").request().get();
            if (response.getStatus() == 200) {
                tiers = response.readEntity(new GenericType<List<Tier>>() {
                });
                return tiers;
            }
    } catch (Exception ex) {
        logger.log(Level.SEVERE,"unable to retrieve tiers",ex);
    }
        return tiers;
}

    private List<AppDynamicsBackend> readBackends(Application app) {
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        List<AppDynamicsBackend> backends = new ArrayList<AppDynamicsBackend>();
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + "/controller/rest/applications/" + app.getId()+ "/backends").request().get();
            if (response.getStatus() == 200) {
               backends = response.readEntity(new GenericType<List<AppDynamicsBackend>>() {
               });
               return backends;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve backends",ex);
        }

        return backends;
    }

    private List<AppDynamicsMetric>  readBackendMetrics(String appName) {
        String metricPath = getPathForBackends(appName);
        List<AppDynamicsMetric> metrics = new ArrayList<AppDynamicsMetric>();
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + metricPath).request().get();
            if (response.getStatus() == 200) {
                metrics = response.readEntity(new GenericType<List<AppDynamicsMetric>>() {
                });
                return metrics;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve backend metrics",ex);
        }
        return null;

    }

    private List<AppDynamicsMetric>  readBTMetrics(String appName, BusinessTransaction bt) {
        String metricPath = getPathForBT(appName, bt);
        List<AppDynamicsMetric> metrics = new ArrayList<AppDynamicsMetric>();
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + metricPath).request().get();
            if (response.getStatus() == 200) {
                metrics = response.readEntity(new GenericType<List<AppDynamicsMetric>>() {
                });
                return metrics;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve bts",ex);
        }
        return null;
        
    }

    private String getPathForBackends(String appName) {
        return "/controller/rest/applications/" + URLEncoder.encode(appName) + "/metric-data?metric-path=Backends%7C*%7C*&time-range-type=BEFORE_NOW&duration-in-mins=1";
    }

    public AppDynamicsTier findTier(BusinessTransaction bt, Application app) {
        AppDynamicsTier tier = new AppDynamicsTier();
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + "/controller/rest/applications/" + app.getId()+ "/tiers/" + bt.getTierId() + "/nodes").request().get();
            if (response.getStatus() == 200) {
                tier = response.readEntity(AppDynamicsTier.class);
                tier.setTierName(bt.getTierName());
                tier.setTierId(bt.getTierId());
                return tier;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve bts",ex);
        }
        return null;
    }

    private String getPathForBT(String appName, BusinessTransaction bt) {
        ///controller/rest/applications/ECommerce_E2E/metric-data?metric-path=Overall%20Application%20Performance%7CAverage%20Response%20Time%20%28ms%29\&time-range-type=BEFORE_NOW\&duration-in-mins=15
        String path = "/controller/rest/applications/" + URLEncoder.encode(appName) + "/metric-data?metric-path=" + "Business%20Transaction%20Performance%7CBusiness%20Transactions%7C" + URLEncoder.encode(bt.getTierName()) +   "%7C" + URLEncoder.encode(bt.getName())
                +"%7C*&time-range-type=BEFORE_NOW&duration-in-mins=1";
        return path;
    }


    private List<BusinessTransaction> readBTsForApp(Application app) {
        List<BusinessTransaction> bts = new ArrayList<BusinessTransaction>();
        AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + "/controller/rest/applications/" + app.getId()+"/business-transactions").request().get();
            if (response.getStatus() == 200) {
                bts = response.readEntity(new GenericType<List<BusinessTransaction>>() {
                });
                return bts;
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE,"unable to retrieve bts",ex);
        }
        return null;
    }

    private List<Application> getApplications() {
            List<Application> apps = new ArrayList<Application>();
            AppDynamicsRESTClient client = new AppDynamicsRESTClient(this.endpoint);
        try {
            Response response = client.getClient().target(this.endpoint.getHost() + "/controller/rest/applications").request().get();
            if (response.getStatus() == 200) {
                apps = response.readEntity(new GenericType<List<Application>>() {
                });
                return apps;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.log(Level.SEVERE,"unable to retrieve applications",ex);
        }
        return null;
    }
    
}
