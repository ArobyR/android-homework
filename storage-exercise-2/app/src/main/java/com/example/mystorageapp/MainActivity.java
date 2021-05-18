package com.example.mystorageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
//        txtData.setText(prefe.getString("datos", ""));
        btnSave = (Button) findViewById(R.id.main_button);
        txtData = (EditText) findViewById(R.id.main_editTextTextMultiLine);

        String[] archivos = fileList();

        if (existe(archivos, "notas.txt")) {
            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("notas.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String information = "";
                while (linea != null) {
                    information += linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                txtData.setText(information);
            }
            catch (IOException e) {
                Toast.makeText(this, "Archivo no cargado", Toast.LENGTH_LONG).show();
            }
        }

    }
    private boolean existe(String[] file, String nameFile) {
        for(int i = 0; i < file.length; i++)
            if (nameFile.equals(file[i]))
                return true;
        return false;
    }

    public void saveData(View v) {
        try {
            // open the file in write mode
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput
                    ("notas.txt", Activity.MODE_PRIVATE));
            archivo.write(txtData.getText().toString()); // get the data
            archivo.flush();
            archivo.close();

        }
        catch (Exception e) {
            Log.d("Mensaje error", e.toString());
        }
        Toast.makeText(this, "GUARDADO", Toast.LENGTH_LONG).show();
    }
}