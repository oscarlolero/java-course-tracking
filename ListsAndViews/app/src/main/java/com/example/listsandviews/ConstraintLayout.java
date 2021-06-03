package com.example.listsandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ConstraintLayout extends AppCompatActivity {

    ListView listView;
    String countries[];
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        listView = findViewById(R.id.list);
        countries = getResources().getStringArray(R.array.countries);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Selected: " + country, Toast.LENGTH_LONG).show();
            }
        });
    }
}