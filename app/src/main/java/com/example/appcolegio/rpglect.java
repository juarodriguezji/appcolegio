package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rpglect extends AppCompatActivity {
    Button goactiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpglect);
        getSupportActionBar().hide();
        goactiv=(Button)findViewById(R.id.button28);
        goactiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rpglect.this,rpgact.class));
            }
        });
    }
}