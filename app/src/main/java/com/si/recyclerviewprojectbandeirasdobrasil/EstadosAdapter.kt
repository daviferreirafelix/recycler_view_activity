package com.si.recyclerviewprojectbandeirasdobrasil

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// Herda de RecyclerView.Adapter e declara o tipo genérico <EstadosAdapter.EstadosAdapterViewHolder>
class EstadosAdapter (private val context: Context,
                      private val estados: List<Estados>,
                      private val onClickListener: EstadoOnClickListener) : RecyclerView.Adapter<EstadosViewHolder>() {


     // Interface que define o comportamento de clique
    interface EstadoOnClickListener{
        fun onClickEstado(holder: EstadosViewHolder?, idx: Int)
    }

    // Infla o layout e cria o VIewHolder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) : EstadosViewHolder{

        // Este método cria uma subclasse de RecyclerView.ViewHolder
        // Infla a view do layout
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_estados, viewGroup, false)

        // Cria a classe do ViewHolder
        return EstadosViewHolder(view)
    }

    // Retorna o tamnho da lista (quantidade de linhas)
    override fun getItemCount(): Int = estados.size


    // Faz o bind das views no ViewHolder com os dados da lista
    override fun onBindViewHolder(holder: EstadosViewHolder, position: Int){

        // Este meétodo recebe o índice do elemento, e atualiza as views que estão dentro do ViewHolder
        val estado = estados[position]

        // Atualiza os valores nas views
        holder.tNome.text = estado.nome
        holder.img.setImageResource(estado.img)


        // Clique no ítem
        holder.itemView.setOnClickListener{
            // Chama o Listener para informar que clicou no Estado
            onClickListener.onClickEstado(holder, position)
        }
    }
}


// Subclasse de REcyclerView.ViewHoler.
// ViewHolder que guarda as referências das views do item
class EstadosViewHolder(view: View): RecyclerView.ViewHolder(view) {

    // Captura o conteúdo das views para salvar no ViewHolder
    var tNome: TextView = view.findViewById(R.id.tNome)
    var img: ImageView = view.findViewById(R.id.imgEstado)
}