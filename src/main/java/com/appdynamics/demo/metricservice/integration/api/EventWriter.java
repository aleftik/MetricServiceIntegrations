package com.appdynamics.demo.metricservice.integration;

public interface EventWriter {
    void write(EventUploadRequest request);
}
