package com.example.imagegallary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button prev,next;
    ImageView img;
    int current =0,total;
    Integer gallery[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.color.colorAccent};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);
        prev=(Button)findViewById(R.id.prev);
        next=(Button)findViewById(R.id.next);
        prev.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        total=gallery.length;
        switch(v.getId())
        {
            case R.id.next:
                if(current +1!=total)
                {
                    current++;
                    img.setImageResource(gallery[current]);
                }else
                {
                    Toast.makeText(this, "you are in last" +
                            " page", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.prev:
                if(current -1!=-1){
                    current--;
                    img.setImageResource(gallery[current]);
                }else {
                    Toast.makeText(this, "you are in first page", Toast.LENGTH_LONG).show();
                }

                break;

        }
    }
}
