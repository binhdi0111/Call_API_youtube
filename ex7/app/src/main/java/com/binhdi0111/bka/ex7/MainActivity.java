package com.binhdi0111.bka.ex7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Url> arrayList;
    AdapterDownloadVideo adapter;
    Example example;
    private static final int REQUEST_PERMISSON_CODE = 123;



    public static final String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkPemisson();
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        arrayList = new ArrayList<>();
        adapter = new AdapterDownloadVideo(this,arrayList);
        recyclerView.setAdapter(adapter);
        AsyncT asyncT = new AsyncT();
        asyncT.execute();

    }
    class AsyncT extends AsyncTask<String,Void,String>{
        MainActivity context;

        @Override
        protected String doInBackground(String... params) {

            try {
                URL url = new URL("https://ssyoutube.com/api/convert"); //Enter URL here
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST"); // here you are telling that it is a POST request, which can be changed into "PUT", "GET", "DELETE" etc.
                httpURLConnection.setRequestProperty("Content-Type", "application/json"); // here you are setting the `Content-Type` for the data you are sending which is `application/json`
                httpURLConnection.connect();
                Link link = new Link("https://www.youtube.com/watch?v=uCbHxLA9t9E");
                Gson gson = new Gson();
                String json = gson.toJson(link);
                JSONObject jsonObject = new JSONObject(json);
                try(OutputStream os = httpURLConnection.getOutputStream()) {
                    byte[] input = json.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }
                try(BufferedReader br = new BufferedReader(
                        new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    System.out.println(response.toString());
                    Example example = new Gson().fromJson(response.toString(),Example.class);
                    Log.d("pppppppppppppp", "doInBackground: "+example.getId()+example.isCipher());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // Stuff that updates the UI
                            if (example != null) {
                                List<Url> urls = example.getUrl();
                                for (Url url :urls) {
                                    arrayList.add(url);
                                    adapter.notifyDataSetChanged();
                                }

                                Log.d("gggggggggggggggggg", "doInBackground: "+arrayList.size());
                                System.out.println("Data not null");
                                for (Url data  : example.getUrl()) {
                                    System.out.println(data.getUrl());
                                }
                            } else {
                                System.out.println("Data null");
                            }
                        }
                    });

                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_PERMISSON_CODE: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "bạn đã cấp quyền", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Permisson Denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
    private void checkPemisson() {
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.O){
            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                String[] permisson = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permisson,REQUEST_PERMISSON_CODE);
            }else {
                Toast.makeText(this, "bạn đã cấp quyền", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "bạn đã cấp quyền", Toast.LENGTH_SHORT).show();
        }
    }



}