package br.edu.fatecpg.lista_tarefas.dao

import br.edu.fatecpg.lista_tarefas.model.Tarefa

class TarefaDao{
    companion object{
        private val tarefas = mutableListOf<Tarefa>()
    }

    fun addTarefa(tarefa:Tarefa){
        tarefas.add(tarefa)
    }

    fun getTarefas():List<Tarefa>{
        return tarefas
    }
}
