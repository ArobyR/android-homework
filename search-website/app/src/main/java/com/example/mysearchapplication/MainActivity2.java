package com.example.mysearchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    WebView webViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webViewer = (WebView) findViewById(R.id.main2_WebView);
        //String urlData ="http://";
        String data = getIntent().getExtras().getString("website");
//        urlData.concat(data);
        webViewer.loadUrl("https://" + data);
    }

    public void closeWindow(View v) {
        finish();
    }
}