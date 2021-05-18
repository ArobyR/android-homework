package com.example.seleccionalenguaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox btnC, btnJava, btnJavascript, btnScala, btnGo, btnRuby, btnSwift, btnDart, btnKotlin,
    btnPython;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (CheckBox) findViewById(R.id.main_checkBoxC);
        btnJava = (CheckBox) findViewById(R.id.main_checkBoxJava);
        btnJavascript = (CheckBox) findViewById(R.id.main_checkBoxJavascript);
        btnScala = (CheckBox) findViewById(R.id.main_checkBoxScala);
        btnGo = (CheckBox) findViewById(R.id.main_checkBoxGo);
        btnRuby = (CheckBox) findViewById(R.id.main_checkBoxRuby);
        btnSwift = (CheckBox) findViewById(R.id.main_checkBoxSwift);
        btnDart = (CheckBox) findViewById(R.id.main_checkBoxDart);
        btnKotlin = (CheckBox) findViewById(R.id.main_checkBoxKotlin);
        btnPython = (CheckBox) findViewById(R.id.main_checkBoxPython);
    }

    public String validLenguages() {
        String languages ="";
        if(btnC.isChecked()) languages +="C ";
        if(btnPython.isChecked()) languages += "Python ";
        if(btnJavascript.isChecked()) languages += "Javascript ";
        if(btnJava.isChecked()) languages += "Java ";
        if(btnGo.isChecked()) languages += "Go " ;
        if(btnRuby.isChecked()) languages += "Ruby ";
        if(btnDart.isChecked()) languages += "Dart ";
        if(btnKotlin.isChecked()) languages += "Kotlin ";
        if(btnScala.isChecked()) languages += "Scala ";
        if(btnSwift.isChecked()) languages += "Swift ";

        return languages;
    }

    public void showLanguages_OnClick(View v) {
        String strLanguages = validLenguages();
        Toast.makeText(this, (String) strLanguages, Toast.LENGTH_LONG).show();

    }
}