package com.example.lista_filmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_filmes.model.Filme
import com.example.lista_filmes.R

class FilmeAdapter(private val filmes:List<Filme>): RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txvNome = itemView.findViewById<TextView>(R.id.txv_nome)
        val txvCategoria = itemView.findViewById<TextView>(R.id.txv_categoria)
        val txvNota = itemView.findViewById<TextView>(R.id.txv_nota)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filmes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filmes[position]
        holder.txvNome.text = filme.nome
        holder.txvCategoria.text = filme.categoria
        holder.txvNota.text = filme.nota.toString()
    }
}