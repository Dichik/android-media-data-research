package com.example.mediadataresearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Intent intentAudio;
    private Intent intentVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void audioPlay(View view) {
        if (intentAudio == null) {
            intentAudio = new Intent(this, AudioActivity.class);
        }
        startActivity(intentAudio);
    }

    public void videoPlay(View view) {
        if (intentVideo == null) {
            intentVideo = new Intent(this, VideoActivity.class);
        }
        startActivity(intentVideo);
    }

}