package com.example.contoh

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.time.Year
import java.util.Locale

class Quest_hotel_bali : AppCompatActivity() {

    private lateinit var tvDatePicker: TextView // ini textview kedua
    private lateinit var button_date_1 : Button // ini untuk button kedua
    private lateinit var tvDatePicker1 : TextView // textview pertama
    private lateinit var button_date_2 : Button // button pertama

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quest_hotel_bali)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val paypalbutton = findViewById<Button>(R.id.paypalbutton)
        paypalbutton.setOnClickListener {
            Toast.makeText(this, "Available!", Toast.LENGTH_SHORT).show()
        }

        val visabutton = findViewById<Button>(R.id.visabutton)
        visabutton.setOnClickListener {
            Toast.makeText(this, "Not available!", Toast.LENGTH_SHORT).show()
        }


        val questbackbutton = findViewById<ImageButton>(R.id.quest_back_button)

        questbackbutton.setOnClickListener {

            val intent = Intent(this,Bali_reserved_page::class.java)
            startActivity(intent)
        } // ini untuk imagebutton nya

        tvDatePicker1 = findViewById(R.id.tvdate1) // buat ini dlu buat ngambil tanggal, ini button ke 2
        button_date_2 = findViewById(R.id.button_date2)

        val myCalendar1 = Calendar.getInstance()

        val tanggalPicker = DatePickerDialog.OnDateSetListener { view, tahun, bulan, hariDibulan ->
            myCalendar1.set(Calendar.YEAR, tahun)
            myCalendar1.set(Calendar.MONTH, bulan)
            myCalendar1.set(Calendar.DAY_OF_MONTH, hariDibulan)
            updateLable1(myCalendar1)
        }

        button_date_2.setOnClickListener{
            DatePickerDialog(this, tanggalPicker, myCalendar1.get(Calendar.YEAR), myCalendar1.get(Calendar.MONTH),
                myCalendar1.get(Calendar.DAY_OF_MONTH)).show()
        } //batasan button ke 2 sampe sini trs dilanjut dibawah

        tvDatePicker = findViewById(R.id.tvdate) //ini button pertama awalnya disini
        button_date_1 = findViewById(R.id.button_date1)

        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable(myCalendar)
        }

        button_date_1.setOnClickListener{
            DatePickerDialog(this, datePicker, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        } //sampe sini batasan button pertama sisanya dilanjut dibawah


        val questpayment = findViewById<Button>(R.id.payment_quest_hotel)

        questpayment.setOnClickListener {

            val intent = Intent(this,quest_hotel_payment::class.java)
            startActivity(intent)
        } // ini untuk button payment nya

    }

    private fun updateLable(myCalendar: Calendar) {         // ini buat munculin tanggalnya kalo dipilih, ini button pertama
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        tvDatePicker.text = sdf.format(myCalendar.time)
    }

    private fun updateLable1(myCalendar1: Calendar) {       // buat munclin tanggal, button ke 2
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        tvDatePicker1.text = sdf.format(myCalendar1.time)
    }



}