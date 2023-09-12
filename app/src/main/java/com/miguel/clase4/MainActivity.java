package com.miguel.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int cedula;
    String nombre;
    Button votacion_A;
    String votacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        votacion_A=findViewById(R.id.votacionA);
        votacion_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                votacion="A";

                Intent enviar_datos = new Intent(MainActivity.this, Resultado.class);

//        nombre de la variable y el valor asociado a esa variable
                enviar_datos.putExtra("nombre", nombre);
                enviar_datos.putExtra("votacion", votacion);
                enviar_datos.putExtra("fecha", "08/02/2004");
                enviar_datos.putExtra("cedula", cedula);
                startActivities(enviar_datos);

            }
        });

        cedula=findViewById(R.id.cedula);


    }
}