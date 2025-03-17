package br.edu.fatecpg.lista_livros

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LivroActivity : AppCompatActivity(R.layout.activity_livro) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val txvTitulo = findViewById<TextView>(R.id.txv_titulo)
        val txvAutor = findViewById<TextView>(R.id.txv_autor)

        val titulo = intent.getStringExtra("tituloLivro")
        txvTitulo.text = "Título: $titulo"

        val autor = intent.getStringExtra("autorLivro")
        txvAutor.text = "Autor: $autor"

    }
}