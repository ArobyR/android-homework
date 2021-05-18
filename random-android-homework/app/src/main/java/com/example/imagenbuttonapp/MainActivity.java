package com.example.imagenbuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ImageButton btnImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImg = (ImageButton) findViewById(R.id.imageButton);
    }

    public void msgUser_OnClick(View v) {
        Toast.makeText(this, "Un mensaje", Toast.LENGTH_LONG).show();
    }
}