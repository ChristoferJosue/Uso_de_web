package com.example.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    //declaracion de controles
    ImageButton btnSiguiente,btnAtras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //recibe el valor de los controles
        btnAtras=(ImageButton) findViewById(R.id.btnAtras3);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //para ir atras a la siguiente actividad al hacer click
                Intent PackageContext;
                Intent SiguienteActivity=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(SiguienteActivity);

            }
        });

    }
}