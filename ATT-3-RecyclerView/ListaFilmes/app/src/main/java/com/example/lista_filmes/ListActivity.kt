package com.example.lista_filmes
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_filmes.adapter.FilmeAdapter
import com.example.lista_filmes.dao.FilmeDao

class ListActivity : AppCompatActivity(R.layout.activity_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = FilmeDao()
        val filmes = dao.getFilmes()
        Log.i("ListFilmes", filmes.toString())

        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = FilmeAdapter(filmes)

    }
}