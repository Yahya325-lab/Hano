package com.example.contoh

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BaliVisa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bali_visa)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val visabali = findViewById<ImageButton>(R.id.balivisaback)

        visabali.setOnClickListener{
            val intent = Intent(this, Bali_Indo_Asli::class.java)
            startActivity(intent)
        }

        val balivisainfo : TextView = findViewById(R.id.visainfo)

        val link = "https://bali.com/bali/bali-visa-indonesia-entry-regulations/"

        balivisainfo.setOnClickListener{
            val uri = Uri.parse(link)
            val mapintent = Intent(Intent.ACTION_VIEW, uri )

            val resolveinfo = intent.resolveActivity(packageManager)
            if (resolveinfo != null){
                startActivity(mapintent)
            }else{
                Toast.makeText(this, "Web tidak tersedia", Toast.LENGTH_SHORT).show()
            }


        }

    }
}