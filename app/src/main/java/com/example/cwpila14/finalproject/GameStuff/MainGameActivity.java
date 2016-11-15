package com.example.cwpila14.finalproject.GameStuff;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.cwpila14.finalproject.R;

public class MainGameActivity extends Activity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer = MediaPlayer.create(this, R.raw.game);
        mediaPlayer.setVolume(0.1f, 0.1f);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
}
