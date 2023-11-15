package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button btnIngresar;
    TextView registrarse;

    EditText etUsuario,etContrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registrarse=findViewById(R.id.textView6);

        etUsuario=(EditText)findViewById(R.id.etUsuario);
        etContrasena=(EditText)findViewById(R.id.etContrasena);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ingresar();
            }
        });

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(login.this, com.miguel.final_is2.registro.class);
                startActivity(registro);
            }
        });

    }

    public void ingresar(){
        try {
            AdminSQLOpenHelper admin= new AdminSQLOpenHelper(this,"administracion",null,1);
            SQLiteDatabase bd=admin.getWritableDatabase();
            String usuario=etUsuario.getText().toString();
            String password=etContrasena.getText().toString();
            Cursor fila=bd.rawQuery("SELECT usuario,password FROM admin WHERE usuario='" + usuario +"' and password='"
            + password+"'",null);

            if (fila.moveToFirst()){
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
            }else {
                etContrasena.setText("");
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Error en la base de datos", Toast.LENGTH_LONG).show();
        }
    }
}