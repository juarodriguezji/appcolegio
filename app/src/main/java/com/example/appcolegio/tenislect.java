package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tenislect extends AppCompatActivity {
    Button cristal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenislect);
        getSupportActionBar().hide();
        cristal=(Button) findViewById(R.id.button36);
        cristal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tenislect.this,tenisact.class));
            }
        });
    }
}