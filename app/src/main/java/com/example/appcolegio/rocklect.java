package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rocklect extends AppCompatActivity {
    Button goact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocklect);
        goact=(Button)findViewById(R.id.button33);
        getSupportActionBar().hide();
        goact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rocklect.this,rockactiv.class));
            }
        });
    }
}