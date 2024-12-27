package com.example.contoh


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val artikelpage = findViewById<ImageButton>(R.id.button_artikel)

        artikelpage.setOnClickListener{
            val intent = Intent(this, artikel::class.java)
            startActivity(intent)
        }

        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {

            val intent = Intent(this, rekomendasi_page::class.java)
            startActivity(intent)
        }

        val button_rekomendasi = findViewById<ImageButton>(R.id.button_rekomendasi)

        button_rekomendasi.setOnClickListener {

            val intent = Intent(this, rekomendasi_page::class.java)
            startActivity(intent)
        }

        val button_home = findViewById<ImageButton>(R.id.button_home)

        button_home.setOnClickListener {

            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }

        class TargetActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_home_page) // Ganti dengan layout yang sesuai
            }
        }

        val bali_button = findViewById<ImageButton>(R.id.bali_button)

        bali_button.setOnClickListener {

            val intent = Intent(this, Bali_Indo_Asli::class.java)
            startActivity(intent)
        }

        val paris_button = findViewById<ImageButton>(R.id.paris_button)

        paris_button.setOnClickListener {

            val intent = Intent(this, paris_france_asli::class.java)
            startActivity(intent)
        }
    }
}