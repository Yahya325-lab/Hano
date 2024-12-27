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

class camplocal2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camplocal2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val karang_kitri_back = findViewById<ImageButton>(R.id.karang_kitri_back_button)

        karang_kitri_back.setOnClickListener{
            val intent = Intent(this, rekomen_camp::class.java)
            startActivity(intent)
        }

        val mapss2 : TextView = findViewById(R.id.maps2)

        val link2 = "https://maps.app.goo.gl/xya2F6qgsQxuTk6B8"

        mapss2.setOnClickListener{
            val uri2 = Uri.parse(link2)
            val mapIntent2 = Intent(Intent.ACTION_VIEW, uri2)

            if (mapIntent2.resolveActivity(packageManager) != null) {
                startActivity(mapIntent2)
            } else {
                Toast.makeText(this, "Google Maps tidak tersedia", Toast.LENGTH_SHORT).show()
            }

        }
    }
}