package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityAgenda : AppCompatActivity() {
    private lateinit var rvEventos: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agenda)

        rvEventos = findViewById(R.id.rvEventos)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }

        val btnNovoEvento = findViewById<Button>(R.id.btnNovoEvento)

        btnNovoEvento.setOnClickListener {
            startActivity(
                Intent(this, CadastroEventoActivity::class.java)
            )
        }



    }
    override fun onResume() {
        super.onResume()
        val banco = BancoHelper(this)
        val eventos = banco.listar()
        rvEventos.layoutManager = LinearLayoutManager(this)
        rvEventos.adapter = EventoAdapter(eventos) { evento ->
// detalhes entram na próxima missão
        }
    }
}