package com.example.services;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServicesExample extends IntentService {

    public ServicesExample() {
        super("name");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("Service", "Service created.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Service", "Service started.");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service", "Service stopped.");

    }

    //intent service stops itself when finishing its processing
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Service", "onHandleIntent method worked");

    }
}
