package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStart;
    Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), ServicesExample.class);
            startService(i);
        });

        buttonStop.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), ServicesExample.class);
            stopService(i);
        });
    }
}