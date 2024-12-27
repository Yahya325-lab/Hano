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

class camplocal1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camplocal1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val kawungtiluback = findViewById<ImageButton>(R.id.kawungtilu_back_button)

        kawungtiluback.setOnClickListener{
            val intent = Intent(this, rekomen_camp::class.java)
            startActivity(intent)
        }

        val mapss1: TextView = findViewById(R.id.maps1)

        val link = "https://maps.app.goo.gl/Nev3BigU9H72neFt9"

        mapss1.setOnClickListener{
            val uri = Uri.parse(link)
            val mapIntent = Intent(Intent.ACTION_VIEW, uri)


            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            } else {
                Toast.makeText(this, "Google Maps tidak tersedia", Toast.LENGTH_SHORT).show()
            }
        }
    }
}