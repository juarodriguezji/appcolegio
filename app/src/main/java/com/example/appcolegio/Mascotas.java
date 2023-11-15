package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mascotas extends AppCompatActivity {
    Button dogfood;
    Button catfood;
    Button petfash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);
        getSupportActionBar().hide();

        dogfood=(Button)findViewById(R.id.button3);
        catfood=(Button)findViewById(R.id.button4);
        petfash=(Button)findViewById(R.id.button5);
        dogfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mascotas.this,dogfoodlect.class));
            }
        });
        catfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mascotas.this,catfoodlect.class));
            }
        });
        petfash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mascotas.this,petfashionlect.class));
            }
        });
    }
}