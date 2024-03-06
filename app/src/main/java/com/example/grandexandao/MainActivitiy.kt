package com.exemplo.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.grandexandao.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<<Button>(R.id.btmlCalcular)
        bmtlCalcular.setOnClickListener {view : View? ->
         var precoAlcool = txtAlcool.text.toStrin().toDouble()
         var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
         var precoGasolina = txtGasolina.text.toString().toDouble()
         var resultado: Double = precoAlcool/precoGasolina
         var mensagem = ""
         if (resultado > 0.7){
             mensagem = "Gasolina"
         }
            else if (resultado < 0.7){
                mensagem = "Álcool"
         }
            else{
                mensagem = "Tanto faz"
         }
            Toast.makeText(this,mensagem,Toast.LENGHT_LONG).show()
        }

    }