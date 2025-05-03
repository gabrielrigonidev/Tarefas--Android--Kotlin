package com.example.lista_filmes.dao
import com.example.lista_filmes.model.Filme

class FilmeDao {
    companion object{
        private val filmes = mutableListOf<Filme>()
    }

    fun addFilme(filme:Filme){
        filmes.add(filme)
    }

    fun getFilmes():List<Filme>{
        return filmes
    }
}