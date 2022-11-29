package com.binhdi0111.bka.ex7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class Second_Activity extends AppCompatActivity {
    VideoView videoView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        videoView = (VideoView) findViewById(R.id.videoView);
        Intent getPath = getIntent();
        String path = getPath.getStringExtra("path");
        String vpath = "android.resource://"+getPackageName()+path;
        Uri vieoURI = Uri.parse(vpath);
        videoView.setVideoURI(vieoURI);
        videoView.start();

        MediaController controller = new MediaController(this);
        videoView.setMediaController(controller);
        controller.setAnchorView(videoView);

    }
}