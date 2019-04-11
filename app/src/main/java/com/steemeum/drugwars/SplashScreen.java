package com.steemeum.drugwars;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class SplashScreen extends AppCompatActivity {

     //open Teleports apps, website activity with button
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent y = new Intent(SplashScreen.this, TeleportsApps.class);
                startActivity(y);
        android.os.Process.killProcess(android.os.Process.myPid()); //using this exits the whole activity

    }










});


        //Make fullscreen
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_IMMERSIVE
                            // Set the content to appear under the system bars so that the
                            // content doesn't resize when the system bars hide and show.
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            // Hide the nav bar and status bar
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN);
        }


//open main activity drugwars.io after x time have passed by

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent a = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(a);


                finish();
            }
        }, 6000);
    }
    }

