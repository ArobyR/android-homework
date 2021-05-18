package com.example.countrylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ListView listViewer;
    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textV = (TextView) findViewById(R.id.main_textViewCountry);
        listViewer = (ListView) findViewById(R.id.main_ListView);
        ArrayList<String> listCountry = new ArrayList<String>();
        listCountry.add("Republica Dominicana");
        listCountry.add("Peru");
        listCountry.add("Puerto Rico");
        listCountry.add("Nueva Zelanda");
        listCountry.add("Inglaterra");
        listCountry.add("Finlandia");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listCountry);
        listViewer.setAdapter(adapter);

        country_Click();
    }

    public void country_Click() {
        listViewer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    textV.setText("10.63 millones");
                }
                if (position == 1) {
                    textV.setText("31.99 millones");
                }
                if (position == 2) {
                    textV.setText("3.194 millones");
                }
                if (position == 3) {
                    textV.setText("4.886 millones");
                }
                if (position == 4) {
                    textV.setText("55.98 millones");
                }
                if (position == 5) {
                    textV.setText("5.518 millones");
                }
            }
        });

    }
}