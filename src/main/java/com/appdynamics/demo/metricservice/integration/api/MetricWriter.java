package com.appdynamics.demo.metricservice.integration;

public interface MetricWriter {

    void write(MetricUploadRequest request);
}
