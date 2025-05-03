package br.edu.fatecpg.atividadepratica3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.atividadepratica3.adaptador.FilmeAdapter
import br.edu.fatecpg.atividadepratica3.dao.FilmeDao

class ListFilmesActivity : AppCompatActivity(R.layout.activity_list_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = FilmeDao()
        val filmes = dao.getFilmes()

        val rvFilmes =findViewById<RecyclerView>(R.id.rv_filmes)
        val layout = LinearLayoutManager(this)
        rvFilmes.layoutManager= layout

        rvFilmes.adapter = FilmeAdapter(filmes)

    }
}