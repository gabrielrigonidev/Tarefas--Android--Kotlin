package br.edu.fatecpg.lista_livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edt_titulo)
        val edtAutor = findViewById<EditText>(R.id.edt_autor)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener{
            val intent = Intent(this, LivroActivity::class.java)
            intent.putExtra("tituloLivro", edtTitulo.text.toString())
            intent.putExtra("autorLivro", edtAutor.text.toString())
            startActivity(intent)
        }

    }
}