package com.example.mc_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iv=findViewById(R.id.iv);
        tv=findViewById(R.id.textView2);
        Intent intent=getIntent();
        String msg= intent.getStringExtra(MainActivity.str);
        tv.setText(msg);
        if(msg.equals("1")){
            iv.setImageResource(R.drawable.one);
        }
        if(msg.equals("2")){
            iv.setImageResource(R.drawable.two);
        }
        if(msg.equals("3")){
            iv.setImageResource(R.drawable.three);
        }
        if(msg.equals("4")){
            iv.setImageResource(R.drawable.four);
        }
        if(msg.equals("5")){
            iv.setImageResource(R.drawable.five);
        }
        if(msg.equals("6")){
            iv.setImageResource(R.drawable.six);
        }
        if(msg.equals("7")){
            iv.setImageResource(R.drawable.seven);
        }
        if(msg.equals("8")){
            iv.setImageResource(R.drawable.eight);
        }
        if(msg.equals("9")){
            iv.setImageResource(R.drawable.nine);
        }
        if(msg.equals("10")){
            iv.setImageResource(R.drawable.ten);
        }
    }
}