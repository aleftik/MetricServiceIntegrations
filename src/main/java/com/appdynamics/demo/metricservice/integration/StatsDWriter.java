package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.*;
import com.timgroup.statsd.StatsDClient;

import java.util.concurrent.BlockingQueue;
import java.util.List;

public class StatsDWriter implements  Writer {
    private BlockingQueue<MetricUploadRequest> queue;
    private StatsDClient client;

    public StatsDWriter(StatsDClient client, BlockingQueue<MetricUploadRequest> queue) {
        this.queue = queue;
        this.client = client;
    }

    public void write() {
        try {
                MetricUploadRequest request = queue.take();
                List<AppDynamicsMetric> appDynamicsMetrics = request.getMetrics();
                for (AppDynamicsMetric metric : appDynamicsMetrics) {
                    if (metric.getMetricValues().size() > 0) {
                         if (metric.getMetricPath().startsWith("Backends")) {
                            client.recordGaugeValue(MetricWriterUtils.cleanupPathForBackend(metric.getMetricPath()), metric.getMetricValues().get(0).getValue(), MetricWriterUtils.generateTagForBackend(metric.getMetricPath(),request));
                        } else {
                             if (metric.getMetricPath().contains("|/travel/createJournal.do|Average Response Time (ms)")) {
                                 System.out.println("m|/travel/createJournal.do|Average Response Time (ms)" + metric.getMetricValues().get(0).getValue()) ;
                             }
                            client.recordGaugeValue(MetricWriterUtils.cleanupPath(metric.getMetricPath()), metric.getMetricValues().get(0).getValue(), MetricWriterUtils.generateTag(request));
                        }
                    }
                }

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }


}
