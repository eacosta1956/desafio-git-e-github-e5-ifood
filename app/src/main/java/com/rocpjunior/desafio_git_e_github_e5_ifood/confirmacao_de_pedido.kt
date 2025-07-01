package com.rocpjunior.desafio_git_e_github_e5_ifood

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rocpjunior.desafio_git_e_github_e5_ifood.databinding.ActivityConfirmacaoDePedidoBinding

class confirmacao_de_pedido : AppCompatActivity() {

    private val binding by lazy {
        ActivityConfirmacaoDePedidoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.fabVoltar.setOnClickListener {
            val intent = Intent(this, DetalhesProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}