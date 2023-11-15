package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class tenisact extends AppCompatActivity {
    Integer points=0;
    Button tena;
    RadioButton tenb;
    RadioButton tenc;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenisact);
        getSupportActionBar().hide();
        tena=(Button)findViewById(R.id.button71);
        tenb=(RadioButton) findViewById(R.id.radioButton81);
        tenc=(RadioButton) findViewById(R.id.radioButton83);
        check=(Button) findViewById(R.id.button72);

        tena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        tenb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        tenc.setOnClickListener(new View.OnClickListener() {
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