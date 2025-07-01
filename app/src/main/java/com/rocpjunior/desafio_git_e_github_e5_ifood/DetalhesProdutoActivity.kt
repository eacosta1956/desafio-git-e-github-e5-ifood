package com.rocpjunior.desafio_git_e_github_e5_ifood

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rocpjunior.desafio_git_e_github_e5_ifood.databinding.ActivityDetalhesProdutosBinding

class DetalhesProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesProdutosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.btnConfirmar.setOnClickListener {
            val intent = Intent(this, confirmacao_de_pedido::class.java)
            startActivity(intent)
        }

        binding.btnVoltar.setOnClickListener {
            finish()
        }
    }
}