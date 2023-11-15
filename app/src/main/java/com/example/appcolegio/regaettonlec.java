package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regaettonlec extends AppCompatActivity {
    Button georgia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regaettonlec);
        getSupportActionBar().hide();
        georgia=(Button) findViewById(R.id.button32);
        georgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(regaettonlec.this,regact.class));
            }
        });
    }
}