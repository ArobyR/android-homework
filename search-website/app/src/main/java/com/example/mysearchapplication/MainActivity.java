package com.example.mysearchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    EditText website;
    Button btnBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        website = findViewById(R.id.Main_editTextTextName);
        btnBuscar = findViewById(R.id.Main_button);
    }

    public void buscarWebsite_OnClick(View v) {

        String strWebsite = website.getText().toString();
        Intent I = new Intent(MainActivity.this, MainActivity2.class);
        I.putExtra("website", strWebsite);
        startActivity(I);
    }
}