package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menufashion extends AppCompatActivity {
    Button aut;
    Button spr;
    Button lux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufashion);
        aut=(Button)findViewById(R.id.button7);
        spr=(Button)findViewById(R.id.button8);
        lux=(Button)findViewById(R.id.button9);
        aut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menufashion.this,autumntrendslect.class));
            }
        });
        spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menufashion.this,springsumlect.class));

            }
        });
        lux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menufashion.this,luxurybrandslect.class));
            }
        });
    }
}