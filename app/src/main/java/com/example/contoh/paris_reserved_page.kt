package com.example.contoh

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class paris_reserved_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paris_reserved_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val parispreservedback = findViewById<ImageButton>(R.id.paris_preserved_back_button)

        parispreservedback.setOnClickListener{
            val intent = Intent(this, paris_france_asli::class.java)
            startActivity(intent)
        }

        val astoriahotel = findViewById<ImageButton>(R.id.astoriabutton)

        astoriahotel.setOnClickListener{
            val intent = Intent(this, astoriahotelparis::class.java)
            startActivity(intent)
        }

    }
}