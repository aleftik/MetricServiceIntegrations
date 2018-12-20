package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.api.EventWriter;
import com.appdynamics.demo.metricservice.integration.api.MetricWriter;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteManager implements Runnable {
    private static final Logger logger = Logger.getLogger(WriteManager.class.getName());
    private BlockingQueue<MetricUploadRequest> queue = null;
    private ExecutorService service = null;

    private List<MetricWriter> writers = null;


    public WriteManager(BlockingQueue<MetricUploadRequest> queue, List<MetricWriter> writers, int writerThreadCount) {
        this.queue = queue;
        this.writers = writers;
        this.service = Executors.newFixedThreadPool(writerThreadCount);
    }


    @Override
    public void run() {
        while (true) {
            try {
                MetricUploadRequest request = queue.take();
                service.submit(new Runnable() {
                    @Override
                    public void run() {
                        for (MetricWriter writer : writers) {
                            writer.write(request);
                        }
                    }
                });
            } catch (InterruptedException ie) {
                logger.log(Level.SEVERE, "Interrupted", ie);
            }
        }
    }

}
