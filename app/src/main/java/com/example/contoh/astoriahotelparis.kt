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

class astoriahotelparis : AppCompatActivity() {

    private lateinit var tvDatePicker: TextView // ini textview kedua
    private lateinit var button_date_1 : Button // ini untuk button kedua
    private lateinit var tvDatePicker1 : TextView // textview pertama
    private lateinit var button_date_2 : Button // button pertama

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_astoriahotelparis)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val astoriabackbutt = findViewById<ImageButton>(R.id.astoria_back_button)

        astoriabackbutt.setOnClickListener{
            val intent = Intent(this, paris_reserved_page::class.java)
            startActivity(intent)
        }

        val astoriapayment = findViewById<Button>(R.id.payment_astoria_hotel)

        astoriapayment.setOnClickListener{
            val intent = Intent(this, astoria_hotel_payment::class.java)
            startActivity(intent)
        }

        val paypalbutton2 = findViewById<Button>(R.id.paypalbutton2)
        paypalbutton2.setOnClickListener {
            Toast.makeText(this, "Available!", Toast.LENGTH_SHORT).show()
        }

        val visabutton2 = findViewById<Button>(R.id.visabutton2)
        visabutton2.setOnClickListener {
            Toast.makeText(this, "Not available!", Toast.LENGTH_SHORT).show()
        }

        tvDatePicker1 = findViewById(R.id.tvdate3) // buat ini dlu buat ngambil tanggal, ini button ke 2
        button_date_2 = findViewById(R.id.button_date3)

        val myCalendar3 = Calendar.getInstance()
        val tanggalPicker = DatePickerDialog.OnDateSetListener { view, tahun, bulan, hariDibulan ->
            myCalendar3.set(Calendar.YEAR, tahun)
            myCalendar3.set(Calendar.MONTH, bulan)
            myCalendar3.set(Calendar.DAY_OF_MONTH, hariDibulan)
            updateLable3(myCalendar3)
        }
        button_date_2.setOnClickListener{
            DatePickerDialog(this, tanggalPicker, myCalendar3.get(Calendar.YEAR), myCalendar3.get(Calendar.MONTH),
                myCalendar3.get(Calendar.DAY_OF_MONTH)).show()
        } //batasan button ke 2 sampe sini trs dilanjut dibawah

        tvDatePicker = findViewById(R.id.tvdate2) //ini button pertama awalnya disini
        button_date_1 = findViewById(R.id.button_date4)

        val myCalendar4 = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            myCalendar4.set(Calendar.YEAR, year)
            myCalendar4.set(Calendar.MONTH, month)
            myCalendar4.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable4(myCalendar4)
        }
        button_date_1.setOnClickListener{
            DatePickerDialog(this, datePicker, myCalendar4.get(Calendar.YEAR), myCalendar4.get(Calendar.MONTH),
                myCalendar4.get(Calendar.DAY_OF_MONTH)).show()
        } //sampe sini batasan button pertama sisanya dilanjut dibawah
    }
    private fun updateLable3(myCalendar: Calendar) {         // ini buat munculin tanggalnya kalo dipilih, ini button pertama
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        tvDatePicker.text = sdf.format(myCalendar.time)
    }
    private fun updateLable4(myCalendar1: Calendar) {       // buat munclin tanggal, button ke 2
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        tvDatePicker1.text = sdf.format(myCalendar1.time)
    }
}