package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class autumntrendslect extends AppCompatActivity {
    Button vamos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autumntrendslect);
        getSupportActionBar().hide();
        vamos=(Button)findViewById(R.id.button25);
        vamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(autumntrendslect.this,autact.class));
            }
        });

        ;
    }
}