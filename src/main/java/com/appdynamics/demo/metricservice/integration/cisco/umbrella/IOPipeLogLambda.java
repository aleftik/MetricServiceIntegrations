/**
 * Copyright (c) AppDynamics Technologies
 * @author Adam Leftik
 * @version 4/10/2018
 */
package com.appdynamics.demo.metricservice.integration.cisco.umbrella;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.event.S3EventNotification;

import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.google.gson.JsonObject;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.zip.GZIPInputStream;
import com.iopipe.SimpleRequestHandlerWrapper;
import com.iopipe.IOpipeExecution;



/**
 *
 * This is a lambda function that needs to be  triggered by S3 Events to take a .gziped log file from umbrella
 * and write it to DataDog's Log intake engine.  You must set two environment variables
 * DD_API_KEY - Your Datadog API Key
 * REGION - us-west-2
 * @see <a href="https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/regions/Regions.htmlc/">
 *     Amazon Regions Enum</a>
 *
 */
//public class UmbrellaLogLambda implements RequestHandler<S3Event, String> ,com.iopipe.SimpleRequestHandlerWrapper<S3Event,String> {
public class IOPipeLogLambda extends SimpleRequestHandlerWrapper<S3Event,String> {
    private static final String REGION = "REGION";
    private static final String DD_API_KEY = "DD_API_KEY";
    private static final String LOG_HOST ="intake.logs.datadoghq.com";
    private static final int LOG_PORT=10516;

    private LambdaLogger logger = null;

    protected final String wrappedHandleRequest(IOpipeExecution __exec, S3Event s3Event) {
        return reallyHandleRequest(s3Event,__exec.context());
    };
    /**
     * Main Lambda function
     * @param s3event - should be a new file put event
     * @param context - AWS Context
     * @return empty string
     */
    public String reallyHandleRequest(S3Event s3event, Context context) {
        logger = context.getLogger();
        String region = System.getenv(REGION);
        String apiKey = System.getenv(DD_API_KEY);
        String functionName = context.getFunctionName().toLowerCase();
        //validate the env
        if (!validateEnv(region, apiKey)) {
            logger.log("Valid Region and API Key required REGION:" + region + " DD_API_KEY:" + apiKey);
            return "";
        }

        /*  process each log fle */
        List<S3EventNotification.S3EventNotificationRecord> events = s3event.getRecords();
        for (S3EventNotification.S3EventNotificationRecord record:events) {
            AmazonS3 client = AmazonS3ClientBuilder.standard().withRegion(region).build();
            S3Object file = client.getObject(record.getS3().getBucket().getName(),record.getS3().getObject().getKey());
            List<UmbrellaLogRecord> records = processFile(file);
            writeToLogStream(functionName, apiKey,records);
            client.deleteObject(record.getS3().getBucket().getName(),record.getS3().getObject().getKey());
        }
        return "";
    }

    /**
     * Validate the environment varibale
     * @param region - valid stringify amazon region e.g. us-west-2
     * @param apiKey - Datadog API Key
     * @return true if we have the region and key, false otherwise
     */
    private boolean validateEnv(String region, String apiKey) {
        if ((apiKey == null) ||  ("".equals(apiKey))) {
            return false;
        }

        if ((region !=null) && (!"".equals(region))) {
            Regions r = Regions.valueOf(region);
            if (r != null) return true;
        }

        return false;
    }

    /**
     * Write the record to a TCPS log stream
     * @param functionName -name of the forwarder
     * @param apiKey - account to write the record to
     * @param records - List of records to write
     */
    private void writeToLogStream(String functionName, String apiKey, List<UmbrellaLogRecord> records) {
        Socket socket = null;
        PrintWriter out = null;
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            socket = factory.createSocket(LOG_HOST, LOG_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            for (UmbrellaLogRecord record: records) {
                JsonObject message =  toJson(functionName,record);
                out.print(apiKey + " ");
                out.println(message.toString());
                logger.log("Writing record to log server:" + apiKey + " " + message.toString());
            }
            out.flush();
        } catch (Exception ex) {
            logger.log(ex.getMessage());
        } finally {
            close(out);
            close(socket);
        }


    }

    /**
     * JSON Encode the record
     * @param functionName - What you want to name the the log forwarder
     * @param record - DNS Record
     * @return JSON Encoded String of the DNS Record
     */
    private JsonObject toJson(String functionName, UmbrellaLogRecord record) {
        JsonObject logRecord = new JsonObject();
        logRecord.addProperty("LookupTimeStamp",record.timestamp);
        logRecord.addProperty("host","www.umbrella.com");
        logRecord.addProperty("service","umbrella-dns");
        logRecord.addProperty("ddsource","cisco-umbrella");
        logRecord.addProperty("ddsourcecategory","security");
        logRecord.addProperty("ddtags","forwardername:" + functionName);
        logRecord.addProperty("domain", record.domain);
        logRecord.addProperty("identities", record.identities);
        logRecord.addProperty("internalIp", record.internalIp);
        logRecord.addProperty("externalIp", record.externalIp);
        logRecord.addProperty("granularIdentity", record.granularIdentity);
        logRecord.addProperty("action",record.action);
        logRecord.addProperty("categories",record.categories);
        logRecord.addProperty("type",record.queryType);
        logRecord.addProperty("responseCode",record.responseCode);
        return logRecord;
    }


    /**
     *
     * @param file - S3File to parse
     * @return List of Umbrella Records
     */
    private List<UmbrellaLogRecord> processFile(S3Object file) {
        List<UmbrellaLogRecord> records = new ArrayList<UmbrellaLogRecord>();
        S3ObjectInputStream s3In = null;
        BufferedReader in = null;
        GZIPInputStream gzipStream = null;
        try {
            s3In = file.getObjectContent();
            gzipStream = new GZIPInputStream(s3In);
            in = new BufferedReader(new InputStreamReader(gzipStream));
            CSVParser parser = CSVParser.parse(in,CSVFormat.DEFAULT);
            Iterator it = parser.iterator();
            while (it.hasNext()) {
                CSVRecord record = (CSVRecord) it.next();
                UmbrellaLogRecord logRecord = toUmbrellaRecord(record);
                records.add(logRecord);
            }
        } catch (IOException ioe) {
        } finally {
            close(gzipStream);
            close(gzipStream);
        }
        return records;
    }


    /**
     * Simple dns log record
     */
    private class UmbrellaLogRecord {
        String timestamp;
        String granularIdentity;
        String identities;
        String internalIp;
        String externalIp;
        String action;
        String queryType;
        String responseCode;
        String domain;
        String categories;
    }

    /*
     * Convert CSV to object
     * @return UmbrellaLogRecord
     */
    private UmbrellaLogRecord toUmbrellaRecord(CSVRecord record){
        UmbrellaLogRecord item = new UmbrellaLogRecord();
        item.timestamp = record.get(0);
        item.granularIdentity = record.get(1);
        item.identities = record.get(2);
        item.internalIp = record.get(3);
        item.externalIp = record.get(4);
        item.action = record.get(5);
        item.queryType = record.get(6);
        item.responseCode = record.get(7);
        item.domain = record.get(8);
        item.categories = record.get(9);
        return item;
    }


    private void close(InputStream in) {
        if (in!=null) {
            try {
                in.close();
            } catch (Exception e){}
        }
    }


    private void close(Writer out) {
        if (out!=null) {
            try {
                out.close();
            } catch (Exception e){}
        }
    }

    private void close(Socket socket) {
        if (socket != null) {
            try {socket.close();} catch (Exception ex){}
        }
    }


}
