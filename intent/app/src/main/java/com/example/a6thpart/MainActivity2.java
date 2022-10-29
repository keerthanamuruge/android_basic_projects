package com.example.a6thpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.textView4);
        Bundle bundle=getIntent().getExtras();
        String ip=bundle.getString("ip");
        tv.setText(ip);
    }
}
