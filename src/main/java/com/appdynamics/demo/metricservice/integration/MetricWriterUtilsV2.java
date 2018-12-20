package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.model.AppDynamicsMetric;

public class BackendWriterUtils {

    public static String getMetricName(AppDynamicsMetric metric) {
        String metricPath = metric.getMetricPath();
        if (metricPath.endsWith("(ms)")) {
           metricPath = metricPath.substring(0, metricPath.length()-"(ms)".length()).trim();

        }
        if (metric.isBackendMetric()) {
            return getMetricNameForBackend(metricPath);
        } else if (metric.isBusinessTransactionMetric()) {
            return getMetricNameForBT(metricPath);
        } else if (metric.isNetworkVizMetric()) {
            return getMetricNameForNetViz(metricPath);
        }
        return metricPath;

    }

    public static String getMetricNameForBackend(String appdPath) {
        StringBuffer buf = new StringBuffer("appdynamics.backends.");
            appdPath = appdPath.toLowerCase();
            appdPath = appdPath.replace(' ', '_');
            appdPath = appdPath.substring(appdPath.lastIndexOf('|')+1);
            buf.append(appdPath);
        return buf.toString();
    }

    public static String getMetricNameForBT(String appdPath) {
        StringBuffer buf = new StringBuffer("appdynamics.business_transaction.");
        appdPath = appdPath.toLowerCase();
        appdPath = appdPath.replace(' ', '_');
        appdPath = appdPath.substring(appdPath.lastIndexOf('|')+1);
        buf.append(appdPath);
        return buf.toString();
    }

    public static String getMetricNameForNetViz(String appdPath) {
        StringBuffer buf = new StringBuffer("appdynamics.network.");
            appdPath = appdPath.toLowerCase();

            if (appdPath.contains(" - ")) {
                String firstPart = appdPath.substring(0,appdPath.indexOf(" - "));
                String secondPart = appdPath.substring(appdPath.indexOf(" - ")+ " - ".length());
                appdPath = firstPart + secondPart;
            }

            appdPath = appdPath.substring(appdPath.lastIndexOf('|') +1);
            if (appdPath.startsWith("#")) {
                appdPath = appdPath.substring(1).trim();
            }

            if ((appdPath.indexOf('(')>-1) && (appdPath.indexOf(')')>-1)) {
                    appdPath = appdPath.substring(0,appdPath.indexOf('(')).trim();
            }

            appdPath = appdPath.replace(' ', '.');
            buf.append(appdPath);

        return buf.toString();
    }

}
