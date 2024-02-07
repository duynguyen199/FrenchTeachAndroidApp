package com.example.frenchtecherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button yellowBtn,redBtn,blackBtn,purpleBtn,greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn=findViewById((R.id.blackBtn));
        yellowBtn=findViewById((R.id.yellowBtn));
        purpleBtn=findViewById((R.id.purpleBtn));
        redBtn=findViewById((R.id.redBtn));
        greenBtn=findViewById((R.id.greenBtn));

        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        int clickedBtnId= v.getId();
        if(clickedBtnId == R.id.redBtn){
            PlaySounds(R.raw.red);
        }else if (clickedBtnId == R.id.blackBtn){
            PlaySounds(R.raw.black);
        } else if (clickedBtnId == R.id.greenBtn) {
            PlaySounds(R.raw.green);
        }else if (clickedBtnId == R.id.yellowBtn) {
            PlaySounds(R.raw.yellow);
        }else{
            PlaySounds(R.raw.purple);
        }
    }
    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                getApplicationContext(),
                id
        );
        mediaPlayer.start();
    }
}