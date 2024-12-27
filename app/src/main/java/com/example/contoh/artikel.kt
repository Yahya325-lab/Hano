package com.example.contoh

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class artikel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_artikel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val artikelkeduaini = findViewById<ImageButton>(R.id.artikelkedua2)
        artikelkeduaini.setOnClickListener{
            val intent = Intent(this, artikelkedua::class.java)
            startActivity(intent)
        }

        val artikelkepertama = findViewById<ImageButton>(R.id.artikelpertama)
        artikelkepertama.setOnClickListener{
            val intent = Intent(this, artikel_pertama::class.java)
            startActivity(intent)
        }

        val homebuttonlagi = findViewById<ImageButton>(R.id.home_lagi)
        homebuttonlagi.setOnClickListener{
            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }

        val rekomenbuttonlagi = findViewById<ImageButton>(R.id.rekomen_lagi)
        rekomenbuttonlagi.setOnClickListener(){
            val intent = Intent(this, rekomendasi_page::class.java)
            startActivity(intent)
        }

        val artikelbuttonlagi = findViewById<ImageButton>(R.id.artikel_lagi)
        artikelbuttonlagi.setOnClickListener{
            val intent = Intent(this, artikel::class.java)
            startActivity(intent)
        }



    }
}