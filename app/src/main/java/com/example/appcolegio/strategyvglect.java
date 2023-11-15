package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class strategyvglect extends AppCompatActivity {
    Button ochent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategyvglect);
        getSupportActionBar().hide();
        ochent=(Button) findViewById(R.id.button30);
        ochent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(strategyvglect.this,strvgact.class));
            }
        });
    }
}