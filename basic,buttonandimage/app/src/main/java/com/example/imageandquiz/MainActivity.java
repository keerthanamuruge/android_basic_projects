package com.example.imageandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b,b1;
    TextView t;
    ImageView ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib=(ImageView)findViewById(R.id.imageView);
        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib.setImageResource(R.drawable.ic_launcher_foreground);
                b.setBackgroundColor(Color.BLUE);
            }
        });
        t=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        t.setText("you clicked the button");
        b1.setBackgroundColor(Color.BLUE);
    }
}
