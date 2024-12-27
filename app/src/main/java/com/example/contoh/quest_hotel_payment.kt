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

class quest_hotel_payment : AppCompatActivity() {

    private lateinit var timertextview: TextView
    private lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quest_hotel_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val questpay = findViewById<Button>(R.id.pay_now_quest)

        questpay.setOnClickListener {

            val intent = Intent(this,payment_success_quest::class.java)
            startActivity(intent)
        } // ini untuk button payment nya


        timertextview = findViewById(R.id.timertextview)

        countDownTimer = object : CountDownTimer(1800000L, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Konversi milidetik ke detik dan tampilkan di TextView
                val minutesRemaining = millisUntilFinished / 1000 / 60
                val secondsRemaining = (millisUntilFinished / 1000) % 60
                timertextview.text = "$minutesRemaining:$secondsRemaining"
            }

            override fun onFinish() {
                // Ketika hitung mundur selesai
                timertextview.text = "Waktu Habis!"
            }

        }
        countDownTimer.start()
    }
    override fun onDestroy() {
        super.onDestroy()
        // Hentikan timer saat Activity dihancurkan untuk mencegah kebocoran memori
        countDownTimer.cancel()
    }
}