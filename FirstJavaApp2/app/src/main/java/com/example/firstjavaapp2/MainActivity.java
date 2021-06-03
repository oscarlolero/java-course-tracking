package com.example.firstjavaapp2;

import androidx.appcompat.app.AppCompatActivity;

//import android.graphics.Color;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
//import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
//import android.widget.TextView;
//import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //    TextView text;
    Button button;
    //    ToggleButton toggle;
    Spinner spinner;
    ArrayAdapter adapter;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerCountry);
        adapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                System.out.println(country);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button = findViewById(R.id.button);
        linearLayout = findViewById(R.id.LinearLayout);

        button.setOnClickListener(v -> {
//            Toast.makeText(getApplicationContext(), "Testing Toast", Toast.LENGTH_LONG).show();
//            Snackbar.make(linearLayout, "Testing snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Close", view -> {}).show();
            showDialogMessage();

        });


        //        text = findViewById(R.id.example);
//
//        button.setOnClickListener(v -> button.setBackgroundColor(Color.BLACK));
//
//        text.setTextColor(Color.BLACK);
//        text.setText("hello world");

//        toggle = findViewById(R.id.toggleButton);
//        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if(isChecked) {
//                System.out.println("checked");
//            } else {
//                System.out.println("not checked");
//            }
//        });


    }

    private void showDialogMessage() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Title of dialog")
                .setMessage("Dialog message")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelado", Toast.LENGTH_LONG).show();
                    }
                })
                .setPositiveButton("Ok", (dialog, which) -> Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_LONG).show()).show();

    }
}