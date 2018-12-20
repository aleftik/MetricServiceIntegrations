package com.appdynamics.demo.metricservice.integration.api;

import com.appdynamics.demo.metricservice.integration.MetricUploadRequest;

public interface MetricWriter {

    void write(MetricUploadRequest request);
}
