package com.example.numbersvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    TextView tResult;
    EditText num1, num2;
    Button btnValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =  findViewById(R.id.main_editTextTextNumber1);
        num2 =  findViewById(R.id.main_editTextTexNumber2);
        btnValidation = findViewById(R.id.main_buttonValidation);
        tResult = findViewById(R.id.main_textView3);

    }

    public void validationNumber(View v) {
        String strNumber = num1.getText().toString();
        String strNumber2 = num2.getText().toString();

        if (strNumber.isEmpty() || strNumber2.isEmpty()) {
            return;
        }

        if (Integer.parseInt(strNumber) > Integer.parseInt(strNumber2)) {
            tResult.setText("El primer valor es mayor");
        }
        else if (Integer.parseInt(strNumber) < Integer.parseInt(strNumber2)) {
            tResult.setText("El seguno es mayor");
        }
        else {
            tResult.setText("Son iguales");
        }
    }
}