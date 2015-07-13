package com.example.aravinda.smscandroid_app;

import android.os.AsyncTask;

/**
 * Created by Aravinda on 11-Jul-15.
 */
public class AsyncTasksManager extends AsyncTask<String, Void, String> {

    private OnTaskCompleted listener;

    @Override
    protected String doInBackground(String... url) {
        return new RemoteServiceHandler().sendHttpRequest(url[0]);
    }

    public AsyncTasksManager(OnTaskCompleted listener){
        this.listener=listener;
    }

    @Override
    protected void onPostExecute(String s) {
        listener.onTaskCompleted(s);
    }
}

