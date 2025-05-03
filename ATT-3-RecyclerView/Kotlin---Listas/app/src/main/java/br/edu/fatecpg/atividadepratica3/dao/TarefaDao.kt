package br.edu.fatecpg.atividadepratica3.dao

import br.edu.fatecpg.atividadepratica3.model.Tarefa

class TarefaDao {
    companion object{
        val tarefas = mutableListOf<Tarefa>()
    }

    fun addTarefa(tarefa:Tarefa){
        tarefas.add(tarefa)
    }
    fun getTarefas():List<Tarefa>{
        return tarefas
    }
}