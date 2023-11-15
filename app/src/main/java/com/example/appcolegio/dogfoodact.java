package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class dogfoodact extends AppCompatActivity {
   Integer points=0;
   Button largedog;
   RadioButton cora;
   RadioButton corb;
   Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dogfoodact);

        largedog= (Button)findViewById(R.id.larged);
        cora=(RadioButton)findViewById(R.id.radioButton4) ;
        corb=(RadioButton)findViewById(R.id.radioButton7) ;
        check=(Button)findViewById(R.id.button34);
        largedog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points=points+1;
            }
        });
        cora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        corb.setOnClickListener(new View.OnClickListener() {
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
