package com.example.basicandbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton r1, r2, r3;
    MediaPlayer right,wrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RadioButton) findViewById(R.id.radioButton2);
        r2 = (RadioButton) findViewById(R.id.radioButton3);
        r3 = (RadioButton) findViewById(R.id.radioButton4);
        right=MediaPlayer.create(this,R.raw.clapse);
        wrong=MediaPlayer.create(this,R.raw.wrong);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.radioButton2) {
            r1.setTextColor(Color.RED);
            wrong.start();
        }
        else if (v.getId() == R.id.radioButton3) {
            r2.setTextColor(Color.GREEN);
            right.start();
        }
        else if(v.getId() == R.id.radioButton4) {
            r3.setTextColor(Color.RED);
            wrong.start();
        }
    }
}