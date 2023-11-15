package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class soccerlect extends AppCompatActivity {
    Button munf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccerlect);
        getSupportActionBar().hide();
        munf=(Button) findViewById(R.id.button400);
        munf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(soccerlect.this,socact.class));
            }
        });
    }
}