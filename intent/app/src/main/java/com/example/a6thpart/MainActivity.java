package com.example.a6thpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b;
EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String ip=et.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("ip",ip);
        startActivity(intent);
    }
}
