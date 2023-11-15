package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class musicalmenu extends AppCompatActivity {
    Button roc;
    Button hip;
    Button reggae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicalmenu);
        roc=(Button)findViewById(R.id.button10);
        hip=(Button)findViewById(R.id.button16);
        reggae=(Button)findViewById(R.id.button15);
        roc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(musicalmenu.this,rocklect.class));
            }
        });
        hip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(musicalmenu.this,hiphoplect.class));
            }
        });
        reggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(musicalmenu.this,regaettonlec.class));
            }
        });
    }
}