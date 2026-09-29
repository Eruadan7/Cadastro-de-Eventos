package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)

        setContentView(R.layout.activity_main)

        val btnComecar = findViewById<Button>(R.id.btnComecar)
        btnComecar.setOnClickListener {
            val intent = Intent(this, ActivityAgenda::class.java)
            startActivity(intent)
        }
    }

}