package com.example.ecobog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Inicio8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView imageButtonPerfil = findViewById(R.id.imageButtonPerfil);
        imageButtonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoPerfil = new Intent(Inicio8.this, Editar_perfil7.class);
                startActivity(gotoPerfil);
            }
        });


        ImageView imageButtonRecicla = findViewById(R.id.imageButtonRecicla);
        imageButtonRecicla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotorecicla = new Intent(Inicio8.this, Recicla9.class);
                startActivity(gotorecicla);
            }
        });


        ImageView imageButtonMapa = findViewById(R.id.imageButtonMapa);
        imageButtonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomapa = new Intent(Inicio8.this, Recicla9.class);
                startActivity(gotomapa);
            }
        });



    }
}