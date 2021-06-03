package com.example.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private ArrayList<String> countryNamesList = new ArrayList();
    private ArrayList<String> detailsList = new ArrayList();
    private ArrayList<Integer> imageList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNamesList.add("Mexico");
        countryNamesList.add("EU");
        countryNamesList.add("England");

        detailsList.add("This is the Mexico flag");
        detailsList.add("This is the EU flag");
        detailsList.add("This is the England flag");

        imageList.add(R.drawable.ic_launcher_foreground);
        imageList.add(R.drawable.ic_launcher_background);
        imageList.add(R.drawable.ic_launcher_background);

        adapter = new RecyclerAdapter(countryNamesList, detailsList, imageList, MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}