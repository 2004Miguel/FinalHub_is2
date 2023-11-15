package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivityGuias extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_guias);

        int[] idImagen = {
                R.drawable.img,
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
        };

        String[] nombre = {
                "Marco Antonio",
                "Valentina Carreño",
                "Maria Augenia",
                "Camilo Sanchez",
                "Tony Stark",
                "Salome Caicedo"
        };

        String[] ultimoMensaje ={
                "EntreMontañas", "Senderos de vida","LifeIsNature","Aventuras","Caminos de Paz","El Mirador"
        };

        String[] horaUltimoMensaje ={
                "10:30", "20:50","00:01","03:44","10:45","13:56"
        };
        String[] numeroTelefono ={
                "+57 3127845874", "+57 3207425501","+57 3217410057","+57 3018874966","+57 3127991200","+57 3158004576"
        };

        String[] pais ={
                "Medellín", "Envigado","San Pedro de los milagros","Medellín","Itaguí","Envigado"
        };




        ListAdapter listAdapter = new ListAdapter(MainActivityGuias.this, nombre,ultimoMensaje,horaUltimoMensaje,numeroTelefono,pais,idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        //agregar listener para cuando se hace click sobre el item
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                //Agregar el intent
                Intent irAinformacion = new Intent(MainActivityGuias.this,UserActivity.class)
                        .putExtra("nombre",nombre[posicion])
                        .putExtra("mensaje", ultimoMensaje[posicion])
                        .putExtra("hora",horaUltimoMensaje[posicion])
                        .putExtra("telefono",numeroTelefono[posicion])
                        .putExtra("pais",pais[posicion])
                        .putExtra("imagen",idImagen[posicion]);
                startActivity(irAinformacion);
            }
        });

    }
}