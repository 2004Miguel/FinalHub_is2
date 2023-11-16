package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rutas extends AppCompatActivity {

    Button parati, videos, rutas, agencias,Perfilconfig;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);

        parati = findViewById(R.id.para_ti);
        videos = findViewById(R.id.videos);
        rutas = findViewById(R.id.rutas);
        agencias = findViewById(R.id.agencias);
        Perfilconfig = findViewById(R.id.PerfilConf);

        parati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pt = new Intent(rutas.this, MainActivity.class);

                startActivity(pt);
            }
        });

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(rutas.this, com.miguel.final_is2.videos.class);

                startActivity(vd);
            }
        });

        /*rutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rt = new Intent(rutas.this, MainActivity.class);

                startActivity(rt);
            }
        });*/

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(rutas.this, com.miguel.final_is2.MainActivityGuias.class);

                startActivity(ag);
            }
        });

        Perfilconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(rutas.this, Perfilconfig.class);

                startActivity(ag);
            }
        });
    }
}