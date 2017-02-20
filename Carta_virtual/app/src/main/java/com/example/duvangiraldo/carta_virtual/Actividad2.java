package com.example.duvangiraldo.carta_virtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        Button btn=(Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(Actividad2.this,ActividadPlatos.class);
                startActivity(intent);


            }
        });

        Button btn2=(Button)findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent2=new Intent(Actividad2.this,ActividadPlatos.class);
                startActivity(intent2);


            }
        });

        Button btn3=(Button)findViewById(R.id.button6);
        btn3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent3=new Intent(Actividad2.this,ActividadPlatos.class);
                startActivity(intent3);


            }
        });





    }
}
