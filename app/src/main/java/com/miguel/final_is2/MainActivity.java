package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button videos, rutas, agencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //parati = findViewById(R.id.para_ti);
        videos = findViewById(R.id.videos);
        rutas = findViewById(R.id.rutas);
        agencias = findViewById(R.id.agencias);

        /*parati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pt = new Intent(MainActivity.this, para_ti.class);

                startActivity(pt);
            }
        });*/

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(MainActivity.this, com.miguel.final_is2.videos.class);

                startActivity(vd);
            }
        });

        rutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rt = new Intent(MainActivity.this, com.miguel.final_is2.rutas.class);

                startActivity(rt);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(MainActivity.this, com.miguel.final_is2.agencias.class);

                startActivity(ag);
            }
        });
    }

}