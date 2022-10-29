package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font =30;
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textview);
        b = (Button) findViewById(R.id.color);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 2:
                        t.setTextColor(Color.RED);
                        break;
                    case 3:
                        t.setBackgroundColor(Color.GRAY);
                        break;
                    case 4:
                        b.setText("Magic");
                        break;
                }
                ch++;
                if (ch == 5)
                    ch = 1;

            }
        });
        Button b2=(Button)findViewById(R.id.font);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font++;
                if (font == 40)
                    font = 30;

            }
        });


            }

}

