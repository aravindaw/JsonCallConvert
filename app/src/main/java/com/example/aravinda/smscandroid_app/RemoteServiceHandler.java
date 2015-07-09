package com.example.aravinda.smscandroid_app;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;

/**
 * Created by aravinda on 7/9/15.
 */

public class RemoteServiceHandler {
    private InputStream inputStream;
    private String url = "http://examples.javacodegeeks.com/android/core/view/onclicklistener/android-onclicklistener-example/";

    public String HttpClient() {
        try {

            HttpClient client = new DefaultHttpClient();
            HttpResponse httpResponse = client.execute(new HttpGet(url));
            inputStream = httpResponse.getEntity().getContent();
            Reader reader = new InputStreamReader(inputStream);

            System.out.println(reader+"#############");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String AsyncTasks() {
        return null;
    }

    public static String convertInputStreamToObjects() {
        RemoteServiceHandler rServiceHadler = new RemoteServiceHandler();
        Reader reader = new InputStreamReader(rServiceHadler.inputStream);

        Gson gson = new Gson();
        ModelObject modelObject1 = gson.fromJson(json, ModelObject.class);
        gson.fromJson(reader, Date.class);


        return null;
    }
}
