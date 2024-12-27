package com.example.contoh

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bali_Indo_Asli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bali_indo_asli)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backbutton = findViewById<ImageButton>(R.id.bali_back_button)

        backbutton.setOnClickListener {

            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }

        val balireserved = findViewById<ImageButton>(R.id.bali_reserve_button)

        balireserved.setOnClickListener {

            val intent = Intent(this, Bali_reserved_page::class.java)
            startActivity(intent)
        }

        val balivisabutton = findViewById<ImageButton>(R.id.bali_visa_info_button)

        balivisabutton.setOnClickListener{
            val intent = Intent(this, BaliVisa::class.java)
            startActivity(intent)
        }

    }
}