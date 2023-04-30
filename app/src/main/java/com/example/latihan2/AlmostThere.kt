package com.example.latihan2

//NIM               : 10120763
//Nama              : Hadi Pranta Jati
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.example.latihan2.R


class AlmostThere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        val buttonClick = findViewById<Button>(R.id.verify)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Verify::class.java)
            startActivity(intent)
        }
    }
}