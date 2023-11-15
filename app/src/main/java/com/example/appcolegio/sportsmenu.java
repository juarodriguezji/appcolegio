package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sportsmenu extends AppCompatActivity {
    Button soccer;
    Button bask;
    Button tenn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportsmenu);

        soccer=(Button)findViewById(R.id.button20);
        bask=(Button)findViewById(R.id.button21);
        tenn=(Button)findViewById(R.id.button22);

        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sportsmenu.this,soccerlect.class));
            }
        });
        bask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sportsmenu.this,basketlect.class));
            }
        });
        tenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sportsmenu.this,tenislect.class));
            }
        });
    }
}