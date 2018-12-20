package com.appdynamics.demo.metricservice.integration;

import com.appdynamics.demo.metricservice.integration.api.Reader;
import com.appdynamics.demo.metricservice.integration.appdynamics.AppDynamicsEventServiceEndpoint;
import com.appdynamics.demo.metricservice.integration.appdynamics.model.AppDynamicsBrowserEvent;
import com.google.gson.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public class EventReader implements Reader,JsonDeserializer<EventUploadRequest> {
    private static final Logger logger = Logger.getLogger(EventReader.class.getName());
    private BlockingQueue<EventUploadRequest> queue;
    private AppDynamicsEventServiceEndpoint endpoint;
    private Gson gson;


    public EventReader(AppDynamicsEventServiceEndpoint endpoint ,BlockingQueue<EventUploadRequest> queue) {
        this.endpoint = endpoint;
        this.queue = queue;
        GsonBuilder build = new GsonBuilder().setLenient().serializeNulls();
        build.registerTypeAdapter(EventUploadRequest.class,this);
        gson = build.create();
    }


    public void read() {
        Client client = RESTClientFactory.create(endpoint);
        String query = "SELECT eventTimestamp, pagename, ip, pageurl, geocity, browser, pagetype, browserversion, metrics.`Application Server Calls per Minute`, metrics.`End User Response Time (ms)`, metrics.`Response Available Time (ms)` FROM browser_records";
        long startTime = System.currentTimeMillis()-(60*1000);
        Response response = client.target(endpoint.getHost() + "/events/query?start=" + startTime + "&end=" + System.currentTimeMillis() + "&label=pagedata")
                .request()
                .post(Entity.entity(query,"application/vnd.appd.events+json;v=2"));
        if (response.getStatus() == 200) {
            String resp = response.readEntity(String.class);

            EventUploadRequest events = gson.fromJson(resp, EventUploadRequest.class);

            try {
                queue.put(events);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            logger.severe("Unabe to read events status code is " + response.getStatus());
        }
    }

    @Override
    public EventUploadRequest deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List<AppDynamicsBrowserEvent> events = new ArrayList<AppDynamicsBrowserEvent>();
        if (json instanceof JsonArray) {
            JsonArray response = (JsonArray) json;
            JsonObject returnValue = (JsonObject) response.get(0);
            JsonArray results = (JsonArray) returnValue.get("results");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");

            for (int i = 0; i < results.size(); i++) {
                JsonArray record = (JsonArray)results.get(i);
                Date date = null;
                try {
                    date = sdf.parse(record.get(0).getAsString());
                } catch (ParseException pe) {
                    pe.printStackTrace();
                }

//                long eventTs,
//                String pagename,
//                String ip,
//                String pageurl,
//                String geocity,
//                String browser,
//                String pagetype,
//                String browserversion,
//                Long requestsPerMinute,
//                Long totalEndUserTime,
//                Long responseAvailbleTime

               AppDynamicsBrowserEvent event = new AppDynamicsBrowserEvent(
                       date.getTime()/1000,
                       getStringFromJSON(record.get(1)),
                       getStringFromJSON(record.get(2)),
                       getStringFromJSON(record.get(3)),
                       getStringFromJSON(record.get(4)),
                       getStringFromJSON(record.get(5)),
                       getStringFromJSON(record.get(6)),
                       getStringFromJSON(record.get(7)),
                       parseLong(record.get(8)),
                       parseLong(record.get(9)),
                       parseLong(record.get(10)));
               events.add(event);

            }
        }

        return new EventUploadRequest(events);
    }

    private String getStringFromJSON(JsonElement element) {
        if (element.isJsonNull()) {
            return null;
        }
        return element.getAsString();
    }

    private Long parseLong(JsonElement jsonElement) {
        String value = jsonElement.toString();
        if ((value == null) || ("null").equals(value)) {
            return null;
        }

        return Long.parseLong(value);
    }


}
