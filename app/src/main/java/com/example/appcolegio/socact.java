package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class socact extends AppCompatActivity {
    Integer points=0;
    EditText soca;
    Button socb;
    RadioButton socc;
    Button check;
    String strInput="";
    Integer cifra=0;
    Integer correc=11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socact);
        getSupportActionBar().hide();
        socb=(Button) findViewById(R.id.button66);
        socc=(RadioButton) findViewById(R.id.radioButton67);
        soca=(EditText) findViewById(R.id.oncesoc);
        check=(Button) findViewById(R.id.button68);

        socb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        socc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strInput=soca.getText().toString();
                int cifra=Integer.parseInt(strInput);
                if(cifra==correc){
                    points=points+1;
                }
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