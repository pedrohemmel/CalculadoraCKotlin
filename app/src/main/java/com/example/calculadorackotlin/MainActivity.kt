package com.example.calculadorackotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var txtView: TextView = findViewById(R.id.meuTxtView)
        val txtFieldValor1: EditText = findViewById(R.id.txtFieldValor1)
        val txtFieldValor2: EditText = findViewById(R.id.txtFieldValor2)
        val btnSomar: Button = findViewById(R.id.btnSomar)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDividir: Button = findViewById(R.id.btnDividir)
        val btnSubtrair: Button = findViewById(R.id.btnSubtrair)

        btnSomar.setOnClickListener {
            txtView.setText("${txtFieldValor1.text.toString().toInt() + txtFieldValor2.text.toString().toInt()}")
        }
        btnMultiplicar.setOnClickListener {
            txtView.setText("${txtFieldValor1.text.toString().toInt() * txtFieldValor2.text.toString().toInt()}")
        }

        btnDividir.setOnClickListener {
            txtView.setText("${txtFieldValor1.text.toString().toInt() / txtFieldValor2.text.toString().toInt()}")
        }

        btnSubtrair.setOnClickListener {
            txtView.setText("${txtFieldValor1.text.toString().toInt() - txtFieldValor2.text.toString().toInt()}")
        }
    }
}