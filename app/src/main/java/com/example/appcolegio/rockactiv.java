package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class rockactiv extends AppCompatActivity {
    Button checking;
    Switch switcha;
    Switch switchb;
    Switch switchc;
    Button guitar;
    String hello;
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rockactiv);
        getSupportActionBar().hide();
        switcha = (Switch) findViewById(R.id.switch1);
        switchb = (Switch) findViewById(R.id.switch3);
        switchc = (Switch) findViewById(R.id.switch5);

        guitar = (Button) findViewById(R.id.button47);
        checking=(Button)findViewById(R.id.button49);
        Boolean switchas=switcha.isChecked();
        Boolean switchbs=switchb.isChecked();
        Boolean switchcs=switchc.isChecked();

        switcha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    points=1;

                }else{
                    points=0;
                }
            }
        });
        switchb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    points=points+1;
                }else{
                    points=points;
                }
            }
        });
        switchc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    points=points+1;
                }else{
                    points=points;
                }
            }
        });
        guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points = points + 1;
            }
        });
        checking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (points == 4) {
                    Toast.makeText(getApplicationContext(), "You have a perfect punctuation, Congratulations!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Please read the text a second time your score is :"+ points, Toast.LENGTH_LONG).show();
                    points = 0;
                    finish();
                }
            }

            ;
        });
    }
}

