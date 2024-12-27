package com.example.contoh

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rekomen_camp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rekomen_camp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val kemahlokal3 = findViewById<ImageButton>(R.id.camp3)

        kemahlokal3.setOnClickListener{
            val intent = Intent(this, camplocal3::class.java)
            startActivity(intent)
        }

        val campback = findViewById<ImageButton>(R.id.button_back_camp)

        campback.setOnClickListener{
            val intent = Intent(this, rekomendasi_page::class.java)
            startActivity(intent)
        }

        val kemahlokal = findViewById<ImageButton>(R.id.camp1)

        kemahlokal.setOnClickListener{
            val intent = Intent(this, camplocal1::class.java)
            startActivity(intent)
        }

        val kemahlokal2 = findViewById<ImageButton>(R.id.camp2)

        kemahlokal2.setOnClickListener{
            val intent = Intent(this, camplocal2::class.java)
            startActivity(intent)
        }
    }
}