package com.example.webview;

import android.webkit.SslErrorHandler;
import android.net.http.SslError;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SSLTolerentWebViewClient extends WebViewClient {

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors
    }
}
