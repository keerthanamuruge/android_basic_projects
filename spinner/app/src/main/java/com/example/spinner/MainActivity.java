package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
Spinner spinner;
TextView tv;
List l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.spinner2);
        tv=(TextView)findViewById(R.id.textView);
        l=new ArrayList<String>();
        l.add("India");
        l.add("uk");
        l.add("usa");
        l.add("china");
        ArrayAdapter<String> country=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        spinner.setAdapter(country);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sr=spinner.getItemAtPosition(position).toString();
        tv.setText(sr);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
