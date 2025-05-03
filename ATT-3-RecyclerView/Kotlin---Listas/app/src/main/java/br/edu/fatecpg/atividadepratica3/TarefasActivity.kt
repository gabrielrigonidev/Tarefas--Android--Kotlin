package br.edu.fatecpg.atividadepratica3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.atividadepratica3.dao.TarefaDao
import br.edu.fatecpg.atividadepratica3.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TarefasActivity : AppCompatActivity(R.layout.activity_tarefas) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edt_TituloTarefa)
        val edtDescricao = findViewById<EditText>(R.id.edt_descricaoTarefa)
        val edtPrazo = findViewById<EditText>(R.id.edt_prazoTarefa)
        val btnAdicionar = findViewById<Button>(R.id.btn_adicinarTarefa)
        val fabListaTarefas = findViewById<FloatingActionButton>(R.id.fab_listaTarefas)

        val dao = TarefaDao()

        btnAdicionar.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val descricao = edtDescricao.text.toString()
            val prazo = edtPrazo.text.toString()

            val tarefa = Tarefa(
                titulo = titulo,
                descricao =  descricao,
                prazo = prazo
            )

            dao.addTarefa(tarefa)

            edtTitulo.text.clear()
            edtDescricao.text.clear()
            edtPrazo.text.clear()

        }

        fabListaTarefas.setOnClickListener {
            val intent = Intent(this,ListTarefasActivity::class.java)
            startActivity(intent)
        }




    }
}