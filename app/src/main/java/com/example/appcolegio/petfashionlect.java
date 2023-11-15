package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class petfashionlect extends AppCompatActivity {
    Button gonext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfashionlect);
        getSupportActionBar().hide();
        gonext=(Button)findViewById(R.id.button24);
        gonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(petfashionlect.this,petfashact.class);
                startActivity(intent);
            }
        });
    }
}