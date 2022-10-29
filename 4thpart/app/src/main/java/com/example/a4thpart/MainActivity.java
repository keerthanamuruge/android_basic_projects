package com.example.a4thpart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView tv;
EditText et;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String usr=et.getText().toString();
        tv.setText(usr);
    }
}
