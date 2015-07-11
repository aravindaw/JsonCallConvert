package com.example.aravinda.smscandroid_app;

import android.os.AsyncTask;

import java.nio.channels.AsynchronousCloseException;

/**
 * Created by Aravinda on 11-Jul-15.
 */
public class AsyncTasksManager extends AsyncTask<String, Void, String> {

    RemoteServiceHandler remoteServiceHandler = new RemoteServiceHandler();

    @Override
    protected String doInBackground(String... url) {
        return remoteServiceHandler.HttpClient(url[0]);
    }
}
