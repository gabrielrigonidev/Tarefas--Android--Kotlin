package br.edu.fatecpg.atividadepratica3.adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.atividadepratica3.R
import br.edu.fatecpg.atividadepratica3.model.Filme

class FilmeAdapter (private val filmes:List<Filme>)
    :RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {
        class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

            val txvTitulo = itemView.findViewById<TextView>(R.id.txv_titulo)
            val txvCategoria = itemView.findViewById<TextView>(R.id.txv_categoria)
            val txvNota = itemView.findViewById<TextView>(R.id.txv_nota)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  filmes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filmes[position]
        holder.txvTitulo.text = filme.titulo
        holder.txvCategoria.text = filme.categoria
        holder.txvNota.text = filme.nota.toString()
    }

}