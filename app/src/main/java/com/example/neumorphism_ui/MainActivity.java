package com.example.neumorphism_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView goking;
    View logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        util.blackiteamstatusbar(MainActivity.this,R.color.light_background);

        goking=findViewById(R.id.goking);
        logo=findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in=new Intent(MainActivity.this,LoginActivity.class);
                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(goking,"textview"),
                        Pair.create(logo,"image")

                        );
                startActivity(in,options.toBundle());
            }
        },3000);


         }
}