package com.appdynamics.demo.metricservice.integration.dd;

import com.appdynamics.demo.metricservice.integration.MetricUploadRequest;
import com.appdynamics.demo.metricservice.integration.MetricWriterUtils;
import com.appdynamics.demo.metricservice.integration.api.MetricWriter;
import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsMetric;
import com.timgroup.statsd.StatsDClient;

import java.util.List;

public class StatsDWriter implements MetricWriter {
    private StatsDClient client;

    public StatsDWriter(StatsDClient client) {
        this.client = client;
    }

    public void write(MetricUploadRequest request) {
                List<AppDynamicsMetric> appDynamicsMetrics = request.getMetrics();
                for (AppDynamicsMetric metric : appDynamicsMetrics) {
                    if (metric.getMetricValues().size() > 0) {
                         if (metric.getMetricPath().startsWith("Backends")) {
                            client.recordGaugeValue(MetricWriterUtils.cleanupPathForBackend(metric.getMetricPath()), metric.getMetricValues().get(0).getValue(), MetricWriterUtils.generateTagForBackend(metric.getMetricPath(),request));
                        } else {
                            client.recordGaugeValue(MetricWriterUtils.cleanupPath(metric.getMetricPath()), metric.getMetricValues().get(0).getValue(), MetricWriterUtils.generateTag(request));
                        }
                    }
                }
    }


}
