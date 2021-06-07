package com.example.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<ModelClass> modelClassList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        modelClassList = new ArrayList<>();
        ModelClass modelClass1 = new ModelClass("landscape", "Sky 1");
        ModelClass modelClass2 = new ModelClass("landscape", "Sky 2");
        ModelClass modelClass3 = new ModelClass("landscape", "Sky 3");
        ModelClass modelClass4 = new ModelClass("landscape", "Sky 4");
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass4);

        adapter = new AdapterClass(modelClassList, this);
        recyclerView.setAdapter(adapter);
    }
}