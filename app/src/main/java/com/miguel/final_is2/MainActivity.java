package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button parati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parati = findViewById(R.id.para_ti);

        parati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pt = new Intent(MainActivity.this, para_ti.class);

                startActivity(pt);
            }
        });
    }

}