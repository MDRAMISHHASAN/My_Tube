package com.example.mytube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = findViewById(R.id.myVideoViewId);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.clip);
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        mc.setAnchorView(video);
        video.start();
    }
}
