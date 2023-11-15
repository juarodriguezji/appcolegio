package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class baskact extends AppCompatActivity {
    Integer points=0;
    RadioButton baska;
    RadioButton baskb;
    RadioButton baskc;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baskact);
        getSupportActionBar().hide();
        baska=(RadioButton) findViewById(R.id.radioButton70);
        baskb=(RadioButton) findViewById(R.id.radioButton73);
        baskc=(RadioButton) findViewById(R.id.radioButton77);
        check=(Button) findViewById(R.id.buttonbask);

        baska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        baskb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        baskc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(points==3){
                    Toast.makeText(getApplicationContext(),"You have a perfect punctuation, Congratulations!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please read the text a second time your score is: "+points,Toast.LENGTH_LONG).show();
                    points=0;
                    finish();
                }
            }
        });
    }
}