package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class autact extends AppCompatActivity {
    Integer points=0;
    Button autc;
    RadioButton auta;
    RadioButton autb;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autact);
        getSupportActionBar().hide();
        autc=(Button) findViewById(R.id.button50);
        auta=(RadioButton) findViewById(R.id.radioButton21);
        autb=(RadioButton) findViewById(R.id.radioButton23);
        check=(Button) findViewById(R.id.button51);

        autc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        auta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        autb.setOnClickListener(new View.OnClickListener() {
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