package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class videos extends AppCompatActivity {

    Button parati, videos, rutas, agencias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        parati = findViewById(R.id.para_ti);
        videos = findViewById(R.id.videos);
        rutas = findViewById(R.id.rutas);
        agencias = findViewById(R.id.agencias);

        parati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pt = new Intent(videos.this, MainActivity.class);

                startActivity(pt);
            }
        });

        /*videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(videos.this, com.miguel.final_is2.videos.class);

                startActivity(vd);
            }
        });*/

        rutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rt = new Intent(videos.this, com.miguel.final_is2.rutas.class);

                startActivity(rt);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(videos.this, com.miguel.final_is2.MainActivityGuias.class);

                startActivity(ag);
            }
        });
    }
}