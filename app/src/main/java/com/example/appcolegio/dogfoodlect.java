package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dogfoodlect extends AppCompatActivity {
    Button exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogfoodlect);
        getSupportActionBar().hide();
        exercise=(Button)findViewById(R.id.button150);
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dogfoodlect.this,dogfoodact.class));

            }
        });
    }
}