package com.scorpio.webviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.activity_main);
        webView.loadUrl("https://drive.google.com/file/d/0B4EYmQECIxkzLWc3clZqYi1qN1k/view?usp=sharing");
        Object o = new WebInterface(getApplicationContext());
        webView.addJavascriptInterface(o,"android");
    }
}