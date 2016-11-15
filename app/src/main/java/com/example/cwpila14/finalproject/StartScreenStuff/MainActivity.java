package com.example.cwpila14.finalproject.StartScreenStuff;

import android.app.Activity;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cwpila14.finalproject.R;

public class MainActivity extends Activity {

    private MediaPlayer mediaPlayer;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this.i = (ImageView) findViewById(R.id.charizardGif);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer = MediaPlayer.create(this, R.raw.startscreentwo);
        mediaPlayer.setVolume(0.5f, 0.5f);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
}

