package br.edu.fatecpg.atividadepratica3.dao

import br.edu.fatecpg.atividadepratica3.model.Filme

class FilmeDao {
    companion object {
         val filmes = mutableListOf<Filme>()
    }

    fun addFilme(filme: Filme){
        filmes.add(filme)
    }

    fun getFilmes():List<Filme>{
    return filmes
    }

}