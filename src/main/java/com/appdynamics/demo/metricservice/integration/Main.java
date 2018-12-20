
package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.api.EventWriter;
import com.appdynamics.demo.metricservice.integration.api.MetricWriter;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsControllerEndpoint;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsEventServiceEndpoint;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.UmbrellaMetricsReader;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.UmbrellaRESTEndPoint;
import com.appdynamics.demo.metricservice.integration.cisco.umbrella.model.DomainSecurityInfo;
import com.appdynamics.demo.metricservice.integration.dd.AppDynamicsHttpMetricWriter;
import com.appdynamics.demo.metricservice.integration.dd.DataDogEventHttpWriter;
import com.appdynamics.demo.metricservice.integration.dd.StatsDWriter;
import com.appdynamics.demo.metricservice.integration.outlyer.OutlyerMerticWriter;
import com.appdynamics.demo.metricservice.integration.signalfx.SignalFxHttpMetricWriter;
import com.timgroup.statsd.NonBlockingStatsDClient;

import com.timgroup.statsd.StatsDClient;


import org.apache.commons.cli.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.*;


import static org.apache.http.client.methods.RequestBuilder.options;


public class Main implements  Runnable {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private CommandLine cmd = null;
    private BlockingQueue<MetricUploadRequest> queue = new LinkedBlockingQueue<MetricUploadRequest>();
    private BlockingQueue<EventUploadRequest> eventQueue = new LinkedBlockingQueue<EventUploadRequest>();
    private BlockingQueue<DomainSecurityInfo> domainSecurityQueue = new LinkedBlockingQueue<DomainSecurityInfo>();
    private static final String DD_ENDPOINT = "https://app.datadoghq.com/api/v1/series";
    private static final String FX_ENDPOINT = "https://ingest.signalfx.com/v2/datapoint";
    private static final String OUTLYER_ENDPOINT = "https://api2.outlyer.com/v2/accounts/";

    private MetricsReader reader = null;
    private EventReader eventReader = null;



    private final List<MetricWriter> metricWriters = new ArrayList<MetricWriter>();
    private final List<EventWriter> eventWriters = new ArrayList<EventWriter>();


    private static final StatsDClient statsd = new NonBlockingStatsDClient(
            "",                          /* prefix to any stats; may be null or empty string */
            "localhost",                        /* common case: localhost */
            8125,                                 /* port */
            new String[] {"appdynamics:metrics"}            /* DataDog extension: Constant tags, always applied */
    );


    private void boostrap (String [] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            cmd = parser.parse(buildOptions(), args);
            if (cmd.getOptions().length < 4) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp( "Metric Service Integration", buildOptions() );
            }   else {
                startup();
            }
        } catch (ParseException pa) {
            logger.log(Level.SEVERE,"Unable to parse command line",pa);
        }

    }

    private void startup() {

        reader = new MetricsReader(new AppDynamicsControllerEndpoint(getHost(), getUsername(), getPassword()), queue, getReaderThreadCount());
        eventReader = new EventReader(new AppDynamicsEventServiceEndpoint(getEventsEndpoint(),getEventsCustomerKey(),getEventsAPIKey()),eventQueue);

        if ((getWriter() == null) || ("udp".equals(getWriter().toLowerCase()))) {
            MetricWriter writer = new StatsDWriter(statsd);
            metricWriters.add(writer);
        } else if ("http".equals(getWriter().toLowerCase()) && isDataDogEnabled()){
            MetricWriter writer = new AppDynamicsHttpMetricWriter(DD_ENDPOINT,getApiKey());
            EventWriter eventWriter = new DataDogEventHttpWriter(DD_ENDPOINT,getApiKey());
            metricWriters.add(writer);
            eventWriters.add(eventWriter);
        }

        if (isSignalFxEnabled())  {
            MetricWriter writer = new SignalFxHttpMetricWriter(FX_ENDPOINT,getSignalFxApiKey());
            metricWriters.add(writer);
        }

        if (isOutlyerEnabled()) {
            MetricWriter writer = new OutlyerMerticWriter(OUTLYER_ENDPOINT + getOutlyerAccountId() + "/series",getOutlyerApiKey(), getHost());
            metricWriters.add(writer);
        }

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(10);
        scheduler.scheduleAtFixedRate(this,0,2 , TimeUnit.MINUTES);
        if (isDemoMode()) {
            JettyWebServer server = new JettyWebServer(DD_ENDPOINT, getApiKey(), FX_ENDPOINT, getSignalFxApiKey(), getPort());
            new Thread(server).start();
        }
        WriteManager mgr = new WriteManager(queue,metricWriters,getReaderThreadCount());
        new Thread(mgr).start();

//        new Thread (new UCSManagerSubscriber(getUcsManager())).start();
    }


    public void run () {
        logger.info("Started Read at " + new Date(System.currentTimeMillis()));
        reader.read();

        logger.info("AppDynamics Read Completed at " + new Date(System.currentTimeMillis()));
//        MetricUploadRequest request = null;

//        try { request = queue.take();} catch (InterruptedException ie) {logger.log(Level.SEVERE,"Interrupted",ie);}
//            for (MetricWriter writer: metricWriters) {
//                writer.write(request);
//            }

        EventUploadRequest eventUploadRequest = null;
        if (isEventsEnabled()) {

            eventReader.read();
            logger.info("Controller Read Completed at " + new Date(System.currentTimeMillis()));
            try {
                eventUploadRequest = eventQueue.take();
            } catch (InterruptedException ie) {
                logger.log(Level.SEVERE, "Interrupted", ie);
            }
            for (EventWriter writer : eventWriters) {
                writer.write(eventUploadRequest);
            }
        }

        if (isUmbrellaEnabled()) {
            UmbrellaMetricsReader umbrellaReader = new UmbrellaMetricsReader(new UmbrellaRESTEndPoint(getUmbrellaApiKey()), eventUploadRequest);
            umbrellaReader.read();
            List<DomainSecurityInfo> result =  umbrellaReader.getResult();
            com.appdynamics.demo.metricservice.integration.dd.UmbrellaHttpWriter ddWriter = new com.appdynamics.demo.metricservice.integration.dd.UmbrellaHttpWriter(DD_ENDPOINT,getApiKey());
            com.appdynamics.demo.metricservice.integration.signalfx.UmbrellaHttpWriter fxWriter = new com.appdynamics.demo.metricservice.integration.signalfx.UmbrellaHttpWriter(FX_ENDPOINT,getSignalFxApiKey());
            ddWriter.write(result);
            fxWriter.write(result);
        }
        logger.info("Write Completed at " + new Date(System.currentTimeMillis()));
    }



    public static void main(String [] args) {
        registerShutdown();
        Main ddi = new Main();
        ddi.boostrap(args);
    }

    private static void registerShutdown() {
        Runtime.getRuntime().addShutdownHook(
                new Thread(
                        new Runnable() {
                            public void run() {
                                statsd.close();
                            }
                        }
                )
        );
    }


    private Options buildOptions() {
        Options opts = new Options();
        opts.addOption(new Option("h","host",true,"AppDynamics Controller Host"));
        opts.addOption(new Option("u","user",true, "AppDynamics REST Username"));
        opts.addOption(new Option("p","password",true, "AppDynamics REST Password"));
        opts.addOption(new Option("a","apikey",true, "Datadog API Key"));
        opts.addOption(new Option("f","fxapikey",true, "SignalFx API Key"));
        opts.addOption(new Option("w","writer",true, "Write via UDP or HTTP"));
        opts.addOption(new Option("l","listener",true, "What port you want Jetty to listen on"));
        opts.addOption(new Option("d","dd",true, "Push to Datadog true or false"));
        opts.addOption(new Option("s","sfx",true, "Push to signalfx true or false"));
        opts.addOption(new Option("m","ucsmanager",true, "URL to UCS Manager"));
        opts.addOption(new Option("k","eventAPIKey",true, "Events API Key"));
        opts.addOption(new Option("c","customerKey",true, "Customer API Key"));
        opts.addOption(new Option("r","eventsEndpoint",true, "Event Service Endpoint"));
        opts.addOption(new Option("z","umbrellaEnabled",true, "Umbella Integration Enabled true or false"));
        opts.addOption(new Option("o","outlyerEnabled",true, "Outlyer Integration Enabled true or false"));
        opts.addOption(new Option("y","outlyerAPIKey",true, "Outlyer API Key"));
        opts.addOption(new Option("i","outlyerAccountId",true, "Outlyer Account Id "));
        opts.addOption(new Option("b","umbrellaKey",true, "Umbella API Key"));
        opts.addOption(new Option("e","eventsEnabled",true, "Events Integration Enabled true or false"));
        opts.addOption(new Option("t","readerThreads",true, "Number of reader threads"));
        opts.addOption(new Option("x","demoMode",true, "Demo Mode"));
        return opts;

    }

    public String getHost() {
        try {
            return (String) cmd.getParsedOptionValue("h");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getUsername() {
        try {
            return (String) cmd.getParsedOptionValue("u");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getPassword() {
        try {
            return (String) cmd.getParsedOptionValue("p");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getApiKey() {
        try {
            return (String) cmd.getParsedOptionValue("a");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getWriter() {
        try {
            return (String) cmd.getParsedOptionValue("w");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getUcsManager() {
        try {
            return (String) cmd.getParsedOptionValue("m");
        } catch (ParseException pe) {
            return null;
        }
    }

    public Integer getPort() {
        try {
            String port = (String)cmd.getParsedOptionValue("l");
            return Integer.parseInt(port);
        } catch (ParseException pe) {
            return null;
        }
    }

    public boolean isSignalFxEnabled() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("s");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public boolean isDataDogEnabled() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("d");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public boolean isOutlyerEnabled() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("o");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public String getOutlyerApiKey() {
        try {
            return (String) cmd.getParsedOptionValue("y");
        } catch (ParseException pe) {
            return null;
        }
    }

    public boolean isUmbrellaEnabled() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("z");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public boolean isEventsEnabled() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("e");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public boolean isDemoMode() {
        try {
            String enabled = (String)cmd.getParsedOptionValue("x");
            return Boolean.parseBoolean(enabled);
        } catch (ParseException pe) {
            return false;
        }
    }

    public String getSignalFxApiKey() {
        try {
            return (String) cmd.getParsedOptionValue("f");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getEventsEndpoint() {
        try {
            return (String) cmd.getParsedOptionValue("r");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getEventsAPIKey() {
        try {
            return (String) cmd.getParsedOptionValue("k");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getEventsCustomerKey() {
        try {
            return (String) cmd.getParsedOptionValue("c");
        } catch (ParseException pe) {
            return null;
        }
    }

    public String getUmbrellaApiKey() {
        try {
            return (String) cmd.getParsedOptionValue("b");
        } catch (ParseException pe) {
            return null;
        }
    }

    private Integer getReaderThreadCount() {
        try {
            String port = (String)cmd.getParsedOptionValue("t");
            return Integer.parseInt(port);
        } catch (ParseException pe) {
            return null;
        }
    }

    private String getOutlyerAccountId() {
        try {
            return (String)cmd.getParsedOptionValue("i");
        } catch (ParseException pe) {
            return null;
        }
    }

}