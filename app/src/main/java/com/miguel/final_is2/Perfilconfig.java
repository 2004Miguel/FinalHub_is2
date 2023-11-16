package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Perfilconfig extends AppCompatActivity {

    Button btnExit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfilconfig);

        btnExit=findViewById(R.id.Exit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ag = new Intent(Perfilconfig.this, Splash.class);

                startActivity(ag);
            }
        });



    }

    public void Exit() {



    }
}
