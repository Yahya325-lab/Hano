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

class france_visa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_france_visa)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val visaprancis = findViewById<ImageButton>(R.id.francevisaback)
        visaprancis.setOnClickListener{
            val intent = Intent(this, paris_france_asli::class.java)
            startActivity(intent)
        }

        val prancisvisainfo : TextView = findViewById(R.id.visafranceinfo)

        val link = "https://france-visas.gouv.fr/en/web/france-visas/tourism-private-stay"

        prancisvisainfo.setOnClickListener{
            val uri = Uri.parse(link)
            val mapintent = Intent(Intent.ACTION_VIEW, uri)

            val resolveInfo = intent.resolveActivity(packageManager)
            if (resolveInfo != null) {
                startActivity(mapintent)
            }else{
                Toast.makeText(this, "Web tidak tersedia", Toast.LENGTH_SHORT).show()
            }
        }
    }
}