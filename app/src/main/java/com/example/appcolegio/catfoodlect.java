package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class catfoodlect extends AppCompatActivity {
    Button exergo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catfoodlect);
        getSupportActionBar().hide();
        exergo=(Button)findViewById(R.id.button23);
        exergo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(catfoodlect.this,catfoodact.class));
            }
        });
    }
}