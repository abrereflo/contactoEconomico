package com.example.contactoeconomico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnView1 = findViewById<Button>(R.id.btn1)
        var btnView2 = findViewById<Button>(R.id.btn2)
        //var btnView3 = findViewById<Button>(R.id.btn3)
        //var btnView4 = findViewById<Button>(R.id.btn4)


        btnView1.setOnClickListener {

            var url:String = "https://www.revistaeconomia.com/noticias/"
            val intent = Intent(this, webViewActivity::class .java)
            intent.putExtra("url", url)
            startActivity(intent)
        }
        btnView2.setOnClickListener {

            var url:String = "https://www.revistaeconomia.com/suplementos/"
            val intent = Intent(this, webViewActivity::class .java)
            intent.putExtra("url", url)
            startActivity(intent)
        }

    }
}