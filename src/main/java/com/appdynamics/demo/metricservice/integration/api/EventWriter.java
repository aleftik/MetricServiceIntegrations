package com.appdynamics.demo.metricservice.integration.api;

import com.appdynamics.demo.metricservice.integration.EventUploadRequest;

public interface EventWriter {
    void write(EventUploadRequest request);
}
