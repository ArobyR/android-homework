package com.example.languagueslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewer = (ListView) findViewById(R.id.main_ListView);
        ArrayList<String> listLanguages =  new ArrayList<String>();
        listLanguages.add("JavaScript");
        listLanguages.add("PHP");
        listLanguages.add("Java");
        listLanguages.add("Go");
        listLanguages.add("Csharp");
        listLanguages.add("Visual Basic");
        listLanguages.add("Kotlin");

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listLanguages);
        listViewer.setAdapter(adapter);

        language_Click();
    }

    public void language_Click() {
        listViewer.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "JavaScript", Toast.LENGTH_LONG).show();
                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                }
                if (position == 2) {
                    Toast.makeText(getApplicationContext(), "JAVA", Toast.LENGTH_LONG).show();
                }
                if (position == 3) {
                    Toast.makeText(getApplicationContext(), "GO", Toast.LENGTH_LONG).show();
                }
                if (position == 4) {
                    Toast.makeText(getApplicationContext(), "C#", Toast.LENGTH_LONG).show();
                }
                if (position == 5) {
                    Toast.makeText(getApplicationContext(), "Visual Basic", Toast.LENGTH_LONG).show();
                }
                if (position == 6) {
                    Toast.makeText(getApplicationContext(), "Kotlin", Toast.LENGTH_LONG).show();
                }

                return false;
            }
        });
    }
}