package com.example.aravinda.smscandroid_app;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by aravinda on 7/9/15.
 */

public class RemoteServiceHandler {
    private InputStream inputStream;


    public String HttpClient(String url) {

        String result = null;
        JsonDecoder jsonDecoder = new JsonDecoder();

        try {
            HttpClient client = new DefaultHttpClient();
            HttpResponse httpResponse = client.execute(new HttpGet(url));
            inputStream = httpResponse.getEntity().getContent();

            //input stream validation and converting
            if (inputStream != null) {
                Gson gson = new Gson();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                JsonDecoder obj = gson.fromJson(bufferedReader, JsonDecoder.class);
                result = obj.toString();
//                result = jsonDecoder.decoder(inputStream);
            } else {
                result = "Not valid input Json";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result+"*****************************");
        return result;
    }
}

