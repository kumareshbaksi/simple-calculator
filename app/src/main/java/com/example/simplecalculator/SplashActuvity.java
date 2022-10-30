package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActuvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_actuvity);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);

                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashActuvity.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();
    }
}