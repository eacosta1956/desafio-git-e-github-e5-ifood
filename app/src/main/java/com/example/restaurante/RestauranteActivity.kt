package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.restaurante.Constants // ✅ SOMENTE esse import

class RestauranteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_restaurante)

        // Botão voltar
        val btnVoltar = findViewById<ImageButton>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }

        // Listener no card de produto
        val containerProdutos = findViewById<LinearLayout>(R.id.cardBigFive)
        containerProdutos.setOnClickListener {
            val nome = findViewById<TextView>(R.id.txtNomeBigFive).text.toString()
            val desc = findViewById<TextView>(R.id.txtDescBigFive).text.toString()
            val preco = findViewById<TextView>(R.id.txtPrecoBigFive).text.toString()
            val imagemRes = R.drawable.big_five

            val intent = Intent(this, Class.forName("com.example.restaurante.DetalhesProdutoActivity"))
            intent.putExtra(Constants.EXTRA_NOME, nome)
            intent.putExtra(Constants.EXTRA_DESC, desc)
            intent.putExtra(Constants.EXTRA_PRECO, preco)
            intent.putExtra(Constants.EXTRA_IMAGEM, imagemRes)
            startActivity(intent)
        }

        // Ajuste da borda superior
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
