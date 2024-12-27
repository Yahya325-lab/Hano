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

class camplocal3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camplocal3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mapss3: TextView = findViewById(R.id.maps3)

        val link3 = "https://maps.app.goo.gl/TePUVTNU2C3LBzF67"

        mapss3.setOnClickListener{
            val uri3 = Uri.parse(link3)
            val mapIntent3 = Intent(Intent.ACTION_VIEW, uri3)

            if (mapIntent3.resolveActivity(packageManager) != null) {
                startActivity(mapIntent3)
            } else {
                Toast.makeText(this, "Google Maps tidak tersedia", Toast.LENGTH_SHORT).show()
            }
        }

        val jatisaribackbutton = findViewById<ImageButton>(R.id.jatisar_back_button)

        jatisaribackbutton.setOnClickListener{
            val intent = Intent(this, rekomen_camp::class.java)
            startActivity(intent)
        }
    }
}