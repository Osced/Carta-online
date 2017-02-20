package com.example.duvangiraldo.carta_virtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadPlatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_platos);

        Button btn=(Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(ActividadPlatos.this,MapsActivity.class);
                startActivity(intent);


            }
        });
    }
}
