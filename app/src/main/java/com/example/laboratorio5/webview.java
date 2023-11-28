package com.example.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class webview extends AppCompatActivity {
    //declaracion de controles
    WebView webview1;
    Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        //recibe el valor de los controles
        webview1=(WebView) findViewById(R.id.webview1);
        btnCerrar=(Button)findViewById(R.id.btnCerrar);
        webview1.setWebViewClient(new WebViewClient());

        webview1.loadUrl("https://edem.eu/chat-gpt-que-es-para-que-sirve-y-su-aplicacion-en-la-economia-explicado-por-chat-gpt/");
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}