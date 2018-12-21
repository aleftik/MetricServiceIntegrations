package com.appdynamics.demo.metricservice.integration;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMetricWriterUtilsV2 {

    @Test
    public void testCustomMetricPathExtraction() throws Exception {
        String goodPath = "Application Infrastructure Performance|App Server|Custom Metric|HAProxy|ajax|backend|bytes_in";
        String expectedGoodName = "appdynamics.custom_metric.haproxy.bytes_in";

        String name = MetricWriterUtilsV2.getMetricNameForHaProxyCustomMetric(goodPath);
        assertEquals(name, expectedGoodName);
    }
}
