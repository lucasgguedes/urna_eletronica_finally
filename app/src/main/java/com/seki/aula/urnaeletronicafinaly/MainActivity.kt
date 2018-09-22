package com.seki.aula.urnaeletronicafinaly

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botao
        var botaoConfirma = findViewById<Button>(R.id.botaoConfirma)

        // Recuperando o numero votado
        var numeroPartido = findViewById<TextView>(R.id.numeroVoto);

        // Array de Votos
        var partidoUm = 0;
        var partidoDois = 0;
        var partidoTres = 0;

        botaoConfirma.setOnClickListener{
            // Sound
            var sound = MediaPlayer.create(this, R.raw.urna);

            // Recuperando valor e convertendo
            val numero = Integer.parseInt(numeroPartido.text.toString())

            // Somando voto
            if (numero == 13) {
                partidoUm += 1;
            } else if (numero == 45) {
                partidoDois += 1;
            } else if (numero == 17) {
                partidoTres += 1;
            }

            sound.start()

            val intent = Intent(this@MainActivity, Confirmacao::class.java)
            intent.putExtra("numero", numero.toString())
            startActivity(intent)
        }

    }
}
