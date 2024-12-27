package com.example.contoh

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bali_reserved_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bali_reserved_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spotbutton = findViewById<ImageButton>(R.id.spotback1)

        spotbutton.setOnClickListener {

            val intent = Intent(this, Bali_Indo_Asli::class.java)
            startActivity(intent)
        }
        val questbutton = findViewById<ImageButton>(R.id.bali_hotel_1)

        questbutton.setOnClickListener {

            val intent = Intent(this, Quest_hotel_bali::class.java)
            startActivity(intent)
        }
    }
}