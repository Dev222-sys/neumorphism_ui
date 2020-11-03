package com.example.neumorphism_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout layout_login;
    private Animation animation_fadein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        util.blackiteamstatusbar(LoginActivity.this,R.color.light_background);
        layout_login=findViewById(R.id.layout_login);
        animation_fadein= AnimationUtils.loadAnimation(LoginActivity.this,R.anim.fade_in);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout_login.setVisibility(View.VISIBLE);
                layout_login.setAnimation(animation_fadein);
            }
        },1000);



    }
}