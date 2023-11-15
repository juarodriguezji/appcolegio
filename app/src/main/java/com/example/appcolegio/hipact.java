package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class hipact extends AppCompatActivity {
    Integer points=0;
    RadioButton hipa;
    RadioButton hipb;
    RadioButton hipc;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipact);
        getSupportActionBar().hide();
        hipa=(RadioButton) findViewById(R.id.radioButton50);
        hipb=(RadioButton) findViewById(R.id.radioButton59);
        hipc=(RadioButton) findViewById(R.id.radioButton61);
        check=(Button) findViewById(R.id.button60);

        hipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        hipb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        hipc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (points==3) {
                    Toast.makeText(getApplicationContext(),"You have a perfect score, Congratulations!",Toast.LENGTH_LONG).show();


                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Please read again the article, your score:"+points,Toast.LENGTH_LONG).show();
                    points=0;
                    finish();
                    ;
                }
            }
        });
    }
}