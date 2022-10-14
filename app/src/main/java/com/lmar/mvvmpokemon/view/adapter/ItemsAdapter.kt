package com.lmar.mvvmpokemon.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.lmar.mvvmpokemon.R
import com.lmar.mvvmpokemon.databinding.PokemonItemBinding
import com.lmar.mvvmpokemon.model.PokemonDataModel
import com.lmar.mvvmpokemon.view.fragments.ClickListener
import com.lmar.mvvmpokemon.view.viewholder.ItemViewHolder

class ItemsAdapter(private val listener: ClickListener): RecyclerView.Adapter<ItemViewHolder>() {

    private val resource = R.layout.pokemon_item
    lateinit var context: Context
    private val itemList = mutableListOf<PokemonDataModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        context = parent.context
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: PokemonItemBinding = DataBindingUtil.inflate(layoutInflater, resource, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setItem(itemList[position])
        holder.itemView.setOnClickListener {
            listener.itemSelect(itemList[position])
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setItems(list: MutableList<PokemonDataModel>) {
        itemList.clear()
        itemList.addAll(list)
        notifyDataSetChanged()
    }
}