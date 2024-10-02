package com.example.ecobog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IniciarSesion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonSesion = findViewById(R.id.buttonSesion);
        buttonSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarSesion = new Intent(IniciarSesion4.this, Inicio8.class);
                startActivity(iniciarSesion);
            }
        });


        TextView txtOlvidarContrasena = findViewById(R.id.Olvidaste);
        txtOlvidarContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olvidarContrasena = new Intent(IniciarSesion4.this, OlvidasteContrasena5.class);
                startActivity(olvidarContrasena);
            }
        });

        TextView txtRegistrate = findViewById(R.id.Registrate);
        txtRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrarse = new Intent(IniciarSesion4.this, Registrate6.class);
                startActivity(registrarse);
            }
        });

    }
}