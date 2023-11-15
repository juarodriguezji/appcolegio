package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class luxurybrandslect extends AppCompatActivity {
   Button tururu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_luxurybrandslect);
        tururu=(Button) findViewById(R.id.button27);
        tururu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(luxurybrandslect.this,luxact.class));
            }
        });
        ;
    }
}