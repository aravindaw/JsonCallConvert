package com.example.aravinda.smscandroid_app;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aravinda on 11-Jul-15.
 */
public class JsonDecoder {
    private List<String> ipList = new ArrayList<String>() {
        {
            add("String 1");
            add("String 2");
            add("String 3");
        }
    };


    @Override
    public String toString() {
        return "IP address" + ipList;
    }

}
