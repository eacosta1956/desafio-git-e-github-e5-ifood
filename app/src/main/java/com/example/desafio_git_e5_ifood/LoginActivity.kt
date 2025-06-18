package com.example.desafio_git_e5_ifood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnEntrar = findViewById(R.id.btnEntrar)

        btnEntrar.setOnClickListener {
            val intent = Intent(this, TelaRestaurantesActivity::class.java)
            startActivity(intent)
        }
    }
}