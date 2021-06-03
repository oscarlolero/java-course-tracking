package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<String> textList = new ArrayList<>();
    ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        fillArray();

        GridAdapter adapter = new GridAdapter(this, textList, imageList);
        gridView.setAdapter(adapter);
    }

    public void fillArray() {
        textList.add("Pollo");
        textList.add("Gato");
        textList.add("Perro");
        textList.add("Avestruz");
        textList.add("Dino");
        textList.add("Dino");
        textList.add("Dino");
        textList.add("Dino");
        textList.add("Dino");

        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_foreground);
    }
}