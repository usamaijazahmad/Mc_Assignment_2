package com.example.mc_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    public static final String str="com.example.mc_assignment_2.example.str";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="1";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="2";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="3";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="4";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="5";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="6";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="7";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="8";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="9";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String message="10";
                intent.putExtra(str,message);
                startActivity(intent);
            }
        });
    }
}