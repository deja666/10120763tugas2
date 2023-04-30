package com.example.latihan2
//NIM               : 10120763
//Nama              : Hadi Pranata Jati
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan2.R



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Pindah(view: View) {
        val intent = Intent(this@MainActivity, Registrasi::class.java)
        startActivity(intent)
    }


}