package com.example.a3rdpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g=(WebView)findViewById(R.id.webview);
        g.getSettings().getJavaScriptEnabled();
        g.loadUrl("http://www.hackerrank.com");
    }
}
