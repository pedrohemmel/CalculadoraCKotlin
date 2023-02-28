package com.example.calculadorackotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referenciando variãveis do XML
        val txtFieldValor1: EditText = findViewById(R.id.txtFieldValor1)
        val txtFieldValor2: EditText = findViewById(R.id.txtFieldValor2)
        val btnSomar: Button = findViewById(R.id.btnSomar)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDividir: Button = findViewById(R.id.btnDividir)
        val btnSubtrair: Button = findViewById(R.id.btnSubtrair)

        btnSomar.setOnClickListener {
            var resultado = txtFieldValor1.text.toString().toInt() + txtFieldValor2.text.toString().toInt()
            this.showDialog("Resultado", "${txtFieldValor1.text.toString()} + ${txtFieldValor2.text.toString().toInt()} = ${resultado}")
        }
        btnMultiplicar.setOnClickListener {
            var resultado = txtFieldValor1.text.toString().toInt() * txtFieldValor2.text.toString().toInt()
            this.showDialog("Resultado", "${txtFieldValor1.text.toString()} * ${txtFieldValor2.text.toString().toInt()} = ${resultado}")
        }

        btnDividir.setOnClickListener {
            var resultado = txtFieldValor1.text.toString().toInt() / txtFieldValor2.text.toString().toInt()
            this.showDialog("Resultado", "${txtFieldValor1.text.toString()} / ${txtFieldValor2.text.toString().toInt()} = ${resultado}")
        }

        btnSubtrair.setOnClickListener {
            var resultado = txtFieldValor1.text.toString().toInt() - txtFieldValor2.text.toString().toInt()
            this.showDialog("Resultado", "${txtFieldValor1.text.toString()} - ${txtFieldValor2.text.toString().toInt()} = ${resultado}")
        }
    }

    //Funções aqui
    fun showDialog(title: String, msg: String) {
        AlertDialog.Builder(this)
            .setTitle("${title}")
            .setMessage("${msg}")
            .setPositiveButton("Ok",null)
            .create()
            .show()
    }
}