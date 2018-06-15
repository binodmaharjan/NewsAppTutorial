package com.example.binod.newsapp.network;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadText extends AsyncTask<Void,Void,String>{

    String urls;

    public DownloadText(String urls) {
        this.urls = urls;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }



    @Override
    protected String doInBackground(Void... voids) {
        URL mUrl = null;
        String content = "";
        try {
            mUrl = new URL(urls);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {

            URLConnection connection = mUrl.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while((line = br.readLine()) != null){
                content += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }


    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        Log.i("async Task "," string is  ");
    }
}
