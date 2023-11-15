package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class spvact extends AppCompatActivity {
    Integer points=0;
    EditText spar;
    RadioButton spbr;
    RadioButton spcr;
    Button check;
    String strInput="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spvact);
        getSupportActionBar().hide();
        spar=(EditText) findViewById(R.id.spvi);
        spbr=(RadioButton) findViewById(R.id.radioButton38);
        spcr=(RadioButton) findViewById(R.id.radioButton41);
        check=(Button) findViewById(R.id.button57);

        spbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;};


        });
        spcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;};


        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strInput=spar.getText().toString();
                if (strInput.equalsIgnoreCase("boxing")) {
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