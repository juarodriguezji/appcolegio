package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hiphoplect extends AppCompatActivity {
    Button pharrel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiphoplect);
        getSupportActionBar().hide();
        pharrel=(Button) findViewById(R.id.button37);
        pharrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hiphoplect.this,hipact.class));
            }
        });
    }
}