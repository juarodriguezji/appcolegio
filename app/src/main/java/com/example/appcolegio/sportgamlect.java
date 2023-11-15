package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sportgamlect extends AppCompatActivity {
   Button lamasp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportgamlect);
        getSupportActionBar().hide();
        lamasp=(Button) findViewById(R.id.button29);
        lamasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sportgamlect.this,spvact.class));
            }
        });
    }
}