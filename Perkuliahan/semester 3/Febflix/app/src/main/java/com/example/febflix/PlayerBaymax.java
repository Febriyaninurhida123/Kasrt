package com.example.febflix;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerBaymax extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton fullscreenButton;
    private boolean isFullscreen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baymax);

        videoView = findViewById(R.id.video_view);
        fullscreenButton = findViewById(R.id.fullscreenButton);

        // Setup your VideoView and MediaController here
        initializePlayer();

        fullscreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFullscreen();
            }
        });
    }

    private void initializePlayer() {
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.baymax;
        videoView.setVideoPath(videoPath);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    private void toggleFullscreen() {
        if (isFullscreen) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        isFullscreen = !isFullscreen;
    }
}
