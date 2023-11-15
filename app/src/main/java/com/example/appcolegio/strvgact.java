package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class strvgact extends AppCompatActivity {
    Integer points=0;
    EditText sta;
    RadioButton stb;
    RadioButton stc;
    Button check;
    String strInput="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strvgact);
        getSupportActionBar().hide();
     sta=(EditText) findViewById(R.id.aoe);
     stb=(RadioButton) findViewById(R.id.radioButton51);
     stc=(RadioButton) findViewById(R.id.radioButton54);
     check=(Button) findViewById(R.id.button59);

     stb.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {points=points+1;}


     });
     stc.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {points=points+1;}


     });
     check.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             strInput=sta.getText().toString();
             if(strInput.equalsIgnoreCase("victory")){
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