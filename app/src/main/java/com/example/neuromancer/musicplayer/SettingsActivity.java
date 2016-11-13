package com.example.neuromancer.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button playing;
    private Button artists;
    private Button albums;
    private Button songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Find the Button that shows the Playing Activity
        playing = (Button) findViewById(R.id.playingButton);

        //Find the Button that shows the Artists Activity
        artists = (Button) findViewById(R.id.artistsButton);

        //Find the Button that shows the Albums Activity
        albums = (Button) findViewById(R.id.albumsButton);

        //Find the Button that shows the Songs Activity
        songs = (Button) findViewById(R.id.songsButton);

        //Set a clicklistener on playing Button
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the MainActivity(Playing)
                Intent playingIntent = new Intent(SettingsActivity.this, MainActivity.class);

                //Start the new activity
                startActivity(playingIntent);
            }
        });

        //Set a clicklistener on Artists Button
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the ArtistsActivity
                Intent artistsIntent = new Intent(SettingsActivity.this, ArtistsActivity.class);

                //Start the new activity
                startActivity(artistsIntent);
            }
        });

        //Set a clicklistener on Albums Button
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the AlbumsActivity
                Intent albumsIntent = new Intent(SettingsActivity.this, AlbumsActivity.class);

                //Start the new activity
                startActivity(albumsIntent);
            }
        });

        //Set a clicklistener on Songs Button
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(SettingsActivity.this, SongsActivity.class);

                //Start the new activity
                startActivity(songsIntent);
            }
        });


    }
}

