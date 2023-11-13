package com.miguel.final_is2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    Button videos, rutas, agencias;
    LottieAnimationView like, like2, like3, like4, dislike, dislike2, dislike3, dislike4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //parati = findViewById(R.id.para_ti);
        videos = findViewById(R.id.videos);
        rutas = findViewById(R.id.rutas);
        agencias = findViewById(R.id.agencias);

        like = findViewById(R.id.likeReaction);
        like2 = findViewById(R.id.likeReaction2);
        like3 = findViewById(R.id.likeReaction3);
        like4 = findViewById(R.id.likeReaction4);

        dislike = findViewById(R.id.dislikeReaction);
        dislike2 = findViewById(R.id.dislikeReaction2);
        dislike3 = findViewById(R.id.dislikeReaction3);
        dislike4 = findViewById(R.id.dislikeReaction4);


        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like.playAnimation();
            }
        });

        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike.playAnimation();
            }
        });

        like2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like2.playAnimation();
            }
        });

        like3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like3.playAnimation();
            }
        });

        like4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like4.playAnimation();
            }
        });

        dislike2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike2.playAnimation();
            }
        });

        dislike3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike3.playAnimation();
            }
        });

        dislike4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike4.playAnimation();
            }
        });


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