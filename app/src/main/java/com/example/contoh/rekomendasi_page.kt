package com.example.contoh

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rekomendasi_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rekomendasi_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        class TargetActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_rekomendasi_page) // Ganti dengan layout yang sesuai
            }
        }

        val artikelbutton = findViewById<ImageButton>(R.id.artikel1_button)
        artikelbutton.setOnClickListener{
            val intent = Intent(this, artikel::class.java)
            startActivity(intent)
        }

        val home_button = findViewById<ImageButton>(R.id.home_button)

        home_button.setOnClickListener {

            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }

        val rekomendasi_button = findViewById<ImageButton>(R.id.rekomendasi_button)

        rekomendasi_button.setOnClickListener {

            val intent = Intent(this, rekomendasi_page::class.java)
            startActivity(intent)
        }

        val campbutton = findViewById<ImageButton>(R.id.camp_image)

        campbutton.setOnClickListener{
            val intent = Intent(this, rekomen_camp::class.java)
            startActivity(intent)
        }

    }
}