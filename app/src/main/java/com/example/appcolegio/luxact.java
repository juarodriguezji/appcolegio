package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class luxact extends AppCompatActivity {
    Integer points=0;
    RadioButton luxa;
    RadioButton luxb;
    RadioButton luxc;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxact);
        getSupportActionBar().hide();

        luxa=(RadioButton) findViewById(R.id.radioButton32);
        luxb=(RadioButton) findViewById(R.id.radioButton34);
        luxc=(RadioButton) findViewById(R.id.radioButton37);
        check=(Button)findViewById(R.id.button56);

        luxa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        luxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        luxc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (points==3) {
                    Toast.makeText(getApplicationContext(),"You have a perfect Score, Congratulations!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please read the text a second time your score is: "+points,Toast.LENGTH_LONG).show();
                    points=0;
                    finish();
                }
            }
        });

    }
}