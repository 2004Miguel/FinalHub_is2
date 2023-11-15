package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity {

    String nombre,mensaje,hora,telefono,pais;
    Button parati, videos, rutas, agencias;
    TextView textoNombre, textoMensaje,textoHora,textoTelefono,textoPais;
    int imagen;
    CircleImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        parati = findViewById(R.id.para_ti);
        videos = findViewById(R.id.videos);
        rutas = findViewById(R.id.rutas);
        agencias = findViewById(R.id.agencias);

        textoNombre = findViewById(R.id.textoNombre);
        textoMensaje = findViewById(R.id.textoMensaje);
        textoTelefono = findViewById(R.id.telefono);
        textoPais = findViewById(R.id.pais);
        image = findViewById(R.id.imagen);

        Intent datos = this.getIntent();
        if(datos != null){
            nombre = datos.getStringExtra("nombre");
            mensaje = datos.getStringExtra("mensaje");
            hora = datos.getStringExtra("hora");
            telefono = datos.getStringExtra("telefono");
            pais = datos.getStringExtra("pais");
            imagen = datos.getIntExtra("imagen",R.drawable.img);

            textoPais.setText(pais);
            textoNombre.setText(nombre);
            textoTelefono.setText(telefono);
            textoMensaje.setText(mensaje);
            image.setImageResource(imagen);
        }

        parati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pt = new Intent(UserActivity.this, MainActivity.class);

                startActivity(pt);
            }
        });

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(UserActivity.this, com.miguel.final_is2.videos.class);

                startActivity(vd);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(UserActivity.this, com.miguel.final_is2.MainActivityGuias.class);

                startActivity(ag);
            }
        });

        rutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(UserActivity.this, com.miguel.final_is2.rutas.class);

                startActivity(ag);
            }
        });

    }
}