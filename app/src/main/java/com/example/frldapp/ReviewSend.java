package com.example.frldapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ReviewSend extends AppCompatActivity {

    private String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_send);

        videoPath = getIntent().getStringExtra("videoUri");
        displayVideo(videoPath);

    }

    private void displayVideo(String videoPath){
        final VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(videoPath));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
