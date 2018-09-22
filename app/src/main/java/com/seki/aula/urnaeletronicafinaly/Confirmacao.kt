package com.seki.aula.urnaeletronicafinaly

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Confirmacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao)

        // Image Element
        var image = findViewById<ImageView>(R.id.imageDisplay)
        image.setImageResource(R.drawable.haddad)

        // Name Element
        var labelName = findViewById<TextView>(R.id.nomeCandidato)

        val intent = intent

        if (intent != null) {
            val numero = intent.getStringExtra("numero")

            if (numero == "13") {
                image.setImageResource(R.drawable.haddad)
                labelName.setText("Fernando Haddad - 13")
            } else if (numero == "45") {
                image.setImageResource(R.drawable.alckmin)
                labelName.setText("Geraldo Alckmin - 45")
            } else if (numero == "17") {
                image.setImageResource(R.drawable.bolsonaro)
                labelName.setText("Jair Bolsonaro - 17")
            }
        }

    }
}
