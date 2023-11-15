package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class regact extends AppCompatActivity {
    Integer points=0;
    EditText rega;
    Button regb;
    RadioButton regc;
    Button check;
    String strInput="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regact);
        getSupportActionBar().hide();
        rega=(EditText) findViewById(R.id.regt);
        regb=(Button)findViewById(R.id.button62);
        regc=(RadioButton) findViewById(R.id.radioButton66);
        check=(Button) findViewById(R.id.button64);

        regb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        regc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strInput=rega.getText().toString();
                if (strInput.equalsIgnoreCase("Gasoline")){
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