package br.edu.fatecpg.atividadepratica3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val btnFavoritos = findViewById<Button>(R.id.btn_favoritos)
        val btnTarefas = findViewById<Button>(R.id.btn_tarefas)

        btnFavoritos.setOnClickListener {
            val intent = Intent(this,FavoritosActivity::class.java)
            startActivity(intent)
        }
        btnTarefas.setOnClickListener {
            val intent = Intent(this,TarefasActivity::class.java)
            startActivity(intent)
        }

    }
}