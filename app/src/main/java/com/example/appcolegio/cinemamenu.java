package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cinemamenu extends AppCompatActivity {
    Button vspo;
    Button vrpg;
    Button vstrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemamenu);
        getSupportActionBar().hide();
        vspo=(Button)findViewById(R.id.button17);
        vrpg=(Button)findViewById(R.id.button18);
        vstrat=(Button)findViewById(R.id.button19);
        vspo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cinemamenu.this,sportgamlect.class));
            }
        });
        vrpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cinemamenu.this,rpglect.class));
            }
        });
        vstrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cinemamenu.this,strategyvglect.class));
            }
        });
    }
}