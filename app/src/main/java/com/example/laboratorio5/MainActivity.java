package com.example.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //declaración de los controels
    ImageButton btnSiguiente,btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recibe el valor de los controles
        btnSiguiente=(ImageButton) findViewById(R.id.btnSiguiente);
        btnSalir=(ImageButton)findViewById(R.id.btnSalir) ;

        btnSalir.setOnClickListener(new View.OnClickListener() {//finaliza todas las actividades
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });




        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //para ir a la siguiente actividad al hacer click
                Intent PackageContext;
                Intent SiguienteActivity=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(SiguienteActivity);

            }
        });
    }
}