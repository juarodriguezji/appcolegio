package com.example.appcolegio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class petfashact extends AppCompatActivity {
    Integer points=0;
    EditText num;
    EditText pala;
    RadioButton radda;
    Button checking;
    String etvalue="";
    String strInput="";
    String humani= "Humanization";
    Integer resp=5;
    Integer cifr=0;
    String strNum="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfashact);
        getSupportActionBar().hide();
        num= (EditText) findViewById(R.id.numnum);
        pala=(EditText)findViewById(R.id.texthum);
        radda=(RadioButton) findViewById(R.id.radioButton13);
        checking=(Button)findViewById(R.id.button44);



        radda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {points=points+1;}


        });
        checking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strInput=pala.getText().toString();
                if (strInput.equalsIgnoreCase("Humanization")){
                    points=points+1;
                }
                strNum=num.getText().toString();
                int cifr=Integer.parseInt(strNum);
                if(cifr==resp){
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