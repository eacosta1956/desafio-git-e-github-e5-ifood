package com.example.desafio_git_e_github_e5_ifood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class inicialRestaurantesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial_restaurantes)

        // TODO: configurar clique que chama a próxima tela
        // startActivity(Intent(this, DetalhesRestauranteActivity::class.java))

        findViewById<View>(R.id.inicial_rest).setOnClickListener {
            startActivity(Intent(this, DetalhesRestauranteActivity::class.java))
        }
    }
}