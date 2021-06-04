package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    CheckBox remember;
    String name;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.textEditUserName);
        remember = findViewById(R.id.checkBox);

        retrieveData();
    }

    @Override
    protected void onPause() {
        saveData();

        super.onPause();
    }

    public void saveData() {
        sharedPreferences = getSharedPreferences("saveData", Context.MODE_PRIVATE);
        name = userName.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key name", name);
        editor.commit();
        Toast.makeText(getApplicationContext(), "Your data is saved", Toast.LENGTH_SHORT).show();
    }

    public void retrieveData() {
        sharedPreferences = getSharedPreferences("saveData", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("key name", null);

        userName.setText(name);
    }
}