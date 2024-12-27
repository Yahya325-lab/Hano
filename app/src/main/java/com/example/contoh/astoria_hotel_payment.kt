package com.example.contoh


import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class astoria_hotel_payment : AppCompatActivity() {

    private lateinit var timertextview2: TextView
    private lateinit var countDownTimer2: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_astoria_hotel_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val astoriapaybutt = findViewById<Button>(R.id.astoria_pay_button)

        astoriapaybutt.setOnClickListener{
            intent = Intent(this, payment_succes_astoria::class.java)
            startActivity(intent)
        }

        timertextview2 = findViewById(R.id.timertextview2)

        countDownTimer2 = object : CountDownTimer (1800000L, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Konversi milidetik ke detik dan tampilkan di TextView
                val minutesRemaining = millisUntilFinished / 1000 / 60
                val secondsRemaining = (millisUntilFinished / 1000) % 60
                timertextview2.text = "$minutesRemaining:$secondsRemaining"
            }

            override fun onFinish() {
                // Ketika hitung mundur selesai
                timertextview2.text = "Waktu Habis!"
            }

        }
        countDownTimer2.start()
    }
    override fun onDestroy() {
        super.onDestroy()
        // Hentikan timer saat Activity dihancurkan untuk mencegah kebocoran memori
        countDownTimer2.cancel()
    }
}