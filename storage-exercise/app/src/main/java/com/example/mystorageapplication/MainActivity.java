package com.example.mystorageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    EditText txtNameFile, txtData;
//    Button btnSaveInfo, btnDataRecovery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNameFile = (EditText) findViewById(R.id.main_editText_NameFile);
        txtData = (EditText) findViewById(R.id.main_editTextTextMultiLine);
//        btnSaveInfo = (Button)  findViewById(R.id.main_button_guardar);
//        btnDataRecovery = (Button) findViewById(R.id.main_button_recuperar);
    }

    public void saveInformation(View v) {
        try {
            String fileName = txtNameFile.getText().toString();
            OutputStreamWriter archivo = new OutputStreamWriter(
                    openFileOutput(fileName,
                    Activity.MODE_PRIVATE));
            archivo.write(txtData.getText().toString());
            archivo.flush();
            archivo.close();
        }
        catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void dataRecovery(View v) {
        try {
            String[] archivos = fileList();
            String filedFile = txtNameFile.getText().toString();
            if (filedFile.isEmpty()) {
                Toast.makeText(this, "RELLENE EL CAMPO!!!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (existe(archivos, filedFile )) {
                InputStreamReader archivo = new InputStreamReader(openFileInput(filedFile));
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
        }
        catch (Exception e) {
            Toast.makeText(this, "Recurso no encontrado", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean existe(String[] file, String nameFile) {
        for(int i = 0; i < file.length; i++)
            if (nameFile.equals(file[i]))
                return true;
        return false;
    }
}