package com.example.chapter6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playBttn1, playBttn2;
    MediaPlayer music1, music2;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        playBttn1 = (Button) findViewById(R.id.playMusic1);
        playBttn2 = (Button) findViewById(R.id.playMusic2);
        music1 = new MediaPlayer();
        music2 = new MediaPlayer();

        music1 = MediaPlayer.create(this, R.raw.track1);

        playing = 0;




        playBttn1.setOnClickListener(playBttn1Listener);
        playBttn2.setOnClickListener(playBttn2Listener);
    }
    //This is a very old style and not appropriate, yet u still have to "Suck it"
    View.OnClickListener playBttn1Listener = new Button.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    music1.start();
                    playing = 1;
                    playBttn1.setText("Pause");
                    // playBttn1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    music1.pause();
                    playing = 0;
                    playBttn1.setText("Resume");
                    //  playBttn1.setVisibility(View.VISIBLE);
                    break;
            }

        }
    };
    View.OnClickListener playBttn2Listener = new Button.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    music2.start();
                    playing = 1;
                    playBttn1.setText("Pause");
                   // playBttn1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    music2.pause();
                    playing = 0;
                    playBttn1.setText("Resume");
                  //  playBttn1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}