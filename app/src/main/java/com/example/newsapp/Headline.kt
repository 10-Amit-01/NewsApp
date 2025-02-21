package com.example.newsapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Headline : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_headline)

        webView = findViewById(R.id.webView)
        val url = intent.getStringExtra("url")

        webView.webViewClient = WebViewClient()
        if (url != null) {
            webView.loadUrl(url)
        }
        else{
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
        }

    }
}