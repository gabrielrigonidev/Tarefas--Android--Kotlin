package br.edu.fatecpg.atividadepratica3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.atividadepratica3.adaptador.TarefaAdapter
import br.edu.fatecpg.atividadepratica3.dao.TarefaDao

class ListTarefasActivity : AppCompatActivity(R.layout.activity_list_tarefas) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = TarefaDao()
        val tarefas = dao.getTarefas()

        val rvTarefas = findViewById<RecyclerView>(R.id.rv_tarefas)
        rvTarefas.layoutManager = LinearLayoutManager(this)
        rvTarefas.adapter = TarefaAdapter(tarefas)

    }
}