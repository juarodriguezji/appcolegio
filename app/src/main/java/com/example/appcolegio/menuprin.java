package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuprin extends AppCompatActivity {
    Button mascotas;
    Button fash;
    Button videog;
    Button music;
    Button sports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprin);
        getSupportActionBar().hide();
        mascotas=(Button)findViewById(R.id.button2);
        fash=(Button)findViewById(R.id.button11);
        videog=(Button)findViewById(R.id.button12);
        music=(Button)findViewById(R.id.button13);
        sports=(Button)findViewById(R.id.button14);
        mascotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuprin.this,Mascotas.class));
            }
        });
        fash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuprin.this,menufashion.class));
            }
        });
        videog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuprin.this,cinemamenu.class));
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuprin.this,musicalmenu.class));
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuprin.this,sportsmenu.class));
            }
        });
    }
}