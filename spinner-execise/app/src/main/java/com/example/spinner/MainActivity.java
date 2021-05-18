package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button btnObtener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        btnObtener = (Button) findViewById(R.id.button);
        ArrayList<String> lista = new ArrayList<String>();

        for (int i = 1980; i <= 2021; i++ ) {
            lista.add(String.valueOf(i));
        }

        ArrayAdapter<String> AdaptadorNumber = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                lista);
        spinner.setAdapter(AdaptadorNumber);

        spinner.getSelectedItem();

    }

    public void btnObtener_OnClick(View v) {
        Toast.makeText(getApplicationContext(), (String) spinner.getSelectedItem(), Toast.LENGTH_LONG).show();

    }

}