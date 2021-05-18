package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewElement;
    TextView textCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCountry = (TextView) findViewById(R.id.main_textView2);
        listViewElement = (ListView) findViewById(R.id.main_ListView);
        ArrayList<String> listFruit = new ArrayList<String>();
        listFruit.add("Pera");
        listFruit.add("Manzana");
        listFruit.add("Uva");
        listFruit.add("Aguacate");
        listFruit.add("Guineo");
        listFruit.add("Melocoton");
        listFruit.add("Mango");
        listFruit.add("Tamarindo");
        listFruit.add("Limon");
        listFruit.add("Limon");
        listFruit.add("Limon");
        listFruit.add("Limon");
        listFruit.add("Limon");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listFruit);
        listViewElement.setAdapter(adapter);
    }

}