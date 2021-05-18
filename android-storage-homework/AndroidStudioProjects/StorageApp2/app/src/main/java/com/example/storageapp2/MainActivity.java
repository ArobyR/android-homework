package com.example.storageapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtLastName, phone;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.main_editTextName);
        txtLastName = (EditText) findViewById(R.id.main_editTextEmailAddress);
        phone = (EditText) findViewById(R.id.main_editTextPhone);
        btnSave = (Button) findViewById(R.id.main_button);

        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);

        txtName.setText(prefe.getString("name", ""));
        txtLastName.setText(prefe.getString("lastname", ""));
        phone.setText(prefe.getString("phone", ""));

        save_Onclick();
    }

    public void save_Onclick() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefe.edit();
                editor.putString("name", txtName.getText().toString());
                editor.putString("lastname", txtLastName.getText().toString());
                editor.putString("phone", phone.getText().toString());

                editor.commit();
                Toast.makeText(getApplicationContext(), "Listo", Toast.LENGTH_LONG );
                finish();
            }
        });
    }

}