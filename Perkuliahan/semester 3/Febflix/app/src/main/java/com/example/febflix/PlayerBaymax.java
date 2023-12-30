package com.example.febflix;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class VideoPlayerActivity extends Fragment {

    private SimpleExoPlayer simpleExoPlayer;
    private PlayerView playerView;
    private Button playButton1;
    private Button playButton2;
    private Button playButton3;

    public VideoPlayerActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_video_player, container, false);

        playerView = view.findViewById(R.id.player);
        playButton1 = view.findViewById(R.id.playButton1);
        playButton2 = view.findViewById(R.id.playButton2);
        playButton3 = view.findViewById(R.id.playButton3);

        // Buat objek SimpleExoPlayer
        simpleExoPlayer = new SimpleExoPlayer.Builder(requireContext()).build();

        // Set player ke PlayerView
        playerView.setPlayer(simpleExoPlayer);

        playButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playVideo(R.raw.baymax);
            }
        });

        playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playVideo(R.raw.spongebob);
            }
        });

        playButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playVideo(R.raw.minions);
            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Pastikan untuk melepaskan sumber daya pemutar video saat fragment dihancurkan
        simpleExoPlayer.release();
    }

    // Metode untuk mendapatkan Uri dari video di res/raw
    private Uri getRawVideoUri(int rawResourceId) {
        return Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + rawResourceId);
    }

    // Metode untuk memutar video dari resource raw
    private void playVideo(int rawResourceId) {
        // Hentikan pemutaran video sebelumnya jika ada
        simpleExoPlayer.stop();

        // Dapatkan Uri dari video di res/raw
        Uri videoUri = getRawVideoUri(rawResourceId);

        // Buat MediaItem dari Uri
        MediaItem mediaItem = MediaItem.fromUri(videoUri);

        // Set media item ke SimpleExoPlayer
        simpleExoPlayer.setMediaItem(mediaItem);

        // Siapkan player
        simpleExoPlayer.prepare();

        // Mulai pemutaran video
        simpleExoPlayer.play();
    }
}
