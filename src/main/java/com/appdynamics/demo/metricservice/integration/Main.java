
package com.appdynamics.demo.metricservice.integration;

import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.ServiceCheck;
import com.timgroup.statsd.StatsDClient;
import org.apache.commons.cli.*;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.appdynamics.demo.metricservice.integration.model.Writer;


public class Main implements  Runnable {
    private CommandLine cmd = null;
    private BlockingQueue<MetricUploadRequest> queue = new LinkedBlockingQueue<MetricUploadRequest>();
    MetricsReader reader = null;
    Writer writer = null;

    private static final StatsDClient statsd = new NonBlockingStatsDClient(
            "",                          /* prefix to any stats; may be null or empty string */
            "localhost",                        /* common case: localhost */
            8125,                                 /* port */
            new String[] {"appdynamics:businesstransaction"}            /* DataDog extension: Constant tags, always applied */
    );


    private void boostrap (String [] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            cmd = parser.parse(buildOptions(), args);
            if (cmd.getOptions().length < 4) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp( "Data Dog Integration", buildOptions() );
            }   else {
                startup();
            }
            

        } catch (ParseException pa) {
            pa.printStackTrace();
        }

    }

    private void startup() {
        validateConnectivity();
        String ddEndpoint = "https://app.datadoghq.com/api/v1/series?api_key="+getApiKey();
        reader = new MetricsReader(new AppDynamicsControllerEndpoint(getHost(), getUsername(), getPassword()), queue);
        if ((getWriter() == null) || ("udp".equals(getWriter().toLowerCase()))) {
            writer = new StatsDWriter(statsd, queue);
        } else if ("http".equals(getWriter().toLowerCase())){
            writer = new HttpMetricWriter(ddEndpoint,queue);
        }
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this,0,1 , TimeUnit.MINUTES);
        JettyWebServer server = new JettyWebServer(ddEndpoint,getPort());
        new Thread(server).start();

//        new Thread (new UCSManagerSubscriber(getUcsManager())).start();
    }


    public void run () {
        System.out.println("Started Read at " + new Date(System.currentTimeMillis()));
            reader.read();
        System.out.println("Read Completed at " + new Date(System.currentTimeMillis()));
            writer.write();
        System.out.println("Write Completed at " + new Date(System.currentTimeMillis()));
    }

    private void validateConnectivity() {
        ServiceCheck sc = ServiceCheck
                .builder()
                .withName("foo bar")
                .withStatus(ServiceCheck.Status.OK)
                .build();
        statsd.serviceCheck(sc);
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
        opts.addOption(new Option("w","writer",true, "Write via UDP or HTTP"));
        opts.addOption(new Option("l","listener",true, "What port you want Jetty to listen on"));
        opts.addOption(new Option("m","ucsmanager",true, "URL to UCS Manager"));

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

}
