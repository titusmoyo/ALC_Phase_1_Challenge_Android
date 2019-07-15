package com.example.myalc;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView webby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webby=(WebView)findViewById(R.id.webView);
        //webby.setWebViewClient(new WebViewClient());
        webby.setWebViewClient(new SSLTolerentWebViewClient());
        webby.loadUrl("https://andela.com/alc/");
       // webby.loadUrl("https://techpluz.online");
        //webby.loadUrl("https://andela.com/alc/");
    }///end of onCreate


    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors
    }

}///end of MAIN