package br.edu.fatecpg.lista_tarefas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.lista_tarefas.R
import br.edu.fatecpg.lista_tarefas.model.Tarefa

class TarefaAdapter(private val tarefas:List<Tarefa>): RecyclerView.Adapter<TarefaAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txvNome = itemView.findViewById<TextView>(R.id.txv_nome)
        val txvDescricao = itemView.findViewById<TextView>(R.id.txv_descricao)
        val txvPrazo = itemView.findViewById<TextView>(R.id.txv_prazo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tarefa, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tarefa = tarefas[position]
        holder.txvNome.text = tarefa.nome
        holder.txvDescricao.text = tarefa.descricao
        holder.txvPrazo.text = tarefa.prazo
    }
}