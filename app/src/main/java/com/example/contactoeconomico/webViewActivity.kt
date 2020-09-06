package com.example.contactoeconomico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class webViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        val objetoIntent: Intent = intent
        var url = objetoIntent.getStringExtra("url")

        val mWebView = findViewById<View>(R.id.webView) as WebView
        mWebView.loadUrl( "$url")
        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()
    }
}