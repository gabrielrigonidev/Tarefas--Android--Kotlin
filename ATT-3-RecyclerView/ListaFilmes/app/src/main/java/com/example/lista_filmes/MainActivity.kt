package com.example.lista_filmes
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.lista_filmes.dao.FilmeDao
import com.example.lista_filmes.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtNome: EditText = findViewById(R.id.edt_nome)
        val edtCategoria: EditText = findViewById(R.id.edt_categoria)
        val edtNota: EditText = findViewById(R.id.edt_nota)
        val btnCadastrar: Button = findViewById(R.id.btn_salve)
        val fabList: FloatingActionButton = findViewById(R.id.fab_list)
        val dao = FilmeDao()

        btnCadastrar.setOnClickListener{
            val nome = edtNome.text.toString()
            val categoria = edtCategoria.text.toString()
            val nota = edtNota.text.toString().toDouble()
            val filme = Filme(nome, categoria, nota)
            dao.addFilme(filme)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Criado com sucesso!")
            val dialog = builder.create()
            dialog.show()
            edtNome.text.clear()
            edtNota.text.clear()
            edtCategoria.text.clear()
        }

        fabList.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

    }
}