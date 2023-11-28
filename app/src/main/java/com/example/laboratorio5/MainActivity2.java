package com.example.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity2 extends AppCompatActivity {

    //declaración de controles

    ImageButton btnSiguiente,btnAtras;
    Button btnWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //recibe el valor de los botones siguiente y atras poniendole el sufijo 2 para no confundirnos con el de primer activity
        btnSiguiente=(ImageButton) findViewById(R.id.btnSiguiente2);
        btnAtras=(ImageButton) findViewById(R.id.btnAtras2);
        btnWeb=(Button)findViewById(R.id.btnWeb);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent packageContext;
                Intent btnsitioWeb=new Intent(MainActivity2.this,webview.class);
                startActivity(btnsitioWeb);

            }
        });


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //para ir a la siguiente actividad al hacer click
                Intent PackageContext;
                Intent SiguienteActivity=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(SiguienteActivity);

            }
        });

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //para ir atras a la siguiente actividad al hacer click
                Intent PackageContext;
                Intent SiguienteActivity=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(SiguienteActivity);

            }
        });
    }
}