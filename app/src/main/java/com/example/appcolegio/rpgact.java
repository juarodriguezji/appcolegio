package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class rpgact extends AppCompatActivity {
    Integer points=0;
    RadioButton rpa;
    RadioButton rpb;
    RadioButton rpc;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpgact);
        rpa=(RadioButton)findViewById(R.id.radioButton43);
        rpb=(RadioButton) findViewById(R.id.radioButton46);
        rpc=(RadioButton) findViewById(R.id.radioButton49);
        check=(Button) findViewById(R.id.button58);

        rpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        rpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        rpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (points==3) {
                    Toast.makeText(getApplicationContext(),"You have a perfect score, Congratulations!",Toast.LENGTH_LONG).show();


                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Please read again the article, your score:"+points,Toast.LENGTH_LONG).show();
                    points=0;
                    finish();
                    ;
                }
            }
        });
    }
}