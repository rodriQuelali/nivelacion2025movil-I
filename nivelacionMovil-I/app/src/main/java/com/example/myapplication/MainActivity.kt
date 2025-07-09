package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //la conexion a mi clase R. xml y mi clase kotlin.
        val btnMostar = findViewById<Button>(R.id.btnC)
        //editext, String, no Int, No Double.
        val txtMensaje: EditText = findViewById(R.id.txtN)

        val chN = findViewById<CheckBox>(R.id.chDatos)

        chN.setOnClickListener{
            var mensaje: String = txtMensaje.text.toString()
            Toast.makeText(this, "Hola ${mensaje}", Toast.LENGTH_SHORT).show()
        }

        btnMostar.setOnClickListener {
            if(chN.isChecked){

                Toast.makeText(this, "Esta en Marcado", Toast.LENGTH_SHORT).show()

            }
            var mensaje: String = txtMensaje.text.toString()
            Toast.makeText(this, "Hola ${mensaje}", Toast.LENGTH_SHORT).show()
        }
    }
}