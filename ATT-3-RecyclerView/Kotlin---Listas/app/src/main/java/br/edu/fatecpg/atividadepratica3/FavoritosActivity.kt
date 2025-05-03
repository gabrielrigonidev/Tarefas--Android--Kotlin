package br.edu.fatecpg.atividadepratica3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.atividadepratica3.dao.FilmeDao
import br.edu.fatecpg.atividadepratica3.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FavoritosActivity : AppCompatActivity(R.layout.activity_favoritos) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edt_titulo)
        val edtCategoria = findViewById<EditText>(R.id.edt_categoria)
        val edtNota = findViewById<EditText>(R.id.edt_nota)
        val btnAdicionarFilme = findViewById<Button>(R.id.btn_adicionarFilme)
        val fabVerLista = findViewById<FloatingActionButton>(R.id.fab_verListaFilmes)

        val dao = FilmeDao()

        btnAdicionarFilme.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val categoria = edtCategoria.text.toString()
            val nota = edtNota.text.toString().toDouble()

            val filme = Filme(
                titulo = titulo,
                categoria = categoria,
                nota = nota
            )
            dao.addFilme(filme)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso!")
            builder.setMessage("Filme adionado a lista de favoritos com sucesso!")
            val dialog = builder.create()
            dialog.show()

            edtTitulo.text.clear()
            edtCategoria.text.clear()
            edtNota.text.clear()


        }

        fabVerLista.setOnClickListener {
            val intent = Intent(this,ListFilmesActivity::class.java)
            startActivity(intent)
        }


    }
}