package br.edu.fatecpg.lista_tarefas

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.lista_tarefas.adapter.TarefaAdapter
import br.edu.fatecpg.lista_tarefas.dao.TarefaDao

class ListActivity : AppCompatActivity(R.layout.activity_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = TarefaDao()
        val tarefas = dao.getTarefas()
        Log.i("ListTarefas", tarefas.toString())

        val rvFilmes = findViewById<RecyclerView>(R.id.rv_tarefas)
        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = TarefaAdapter(tarefas)

    }
}