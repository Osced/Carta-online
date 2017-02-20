package com.example.duvangiraldo.carta_virtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(MainActivity.this,Actividad2.class);
                startActivity(intent);


            }
        });


        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent2=new Intent(MainActivity.this,ActividadRegistro.class);
                startActivity(intent2);


            }
        });








}









}



