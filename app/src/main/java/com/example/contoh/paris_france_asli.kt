package com.example.contoh

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class paris_france_asli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paris_france_asli)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val francevisabut = findViewById<ImageButton>(R.id.buttonvisafrance)
        francevisabut.setOnClickListener{
            val intent = Intent(this, france_visa::class.java)
            startActivity(intent)
        }

        val parisbackbutt = findViewById<ImageButton>(R.id.paris_back_button)

        parisbackbutt.setOnClickListener {

            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }


        val preservedbutton = findViewById<ImageButton>(R.id.buttonpreservedparis)

        preservedbutton.setOnClickListener{
            val intent = Intent(this, paris_reserved_page::class.java)
            startActivity(intent)
        }
    }
}