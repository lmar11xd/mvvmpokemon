package com.lmar.mvvmpokemon.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lmar.mvvmpokemon.databinding.PokemonItemBinding
import com.lmar.mvvmpokemon.model.PokemonDataModel

class ItemViewHolder(binding: PokemonItemBinding): RecyclerView.ViewHolder(binding.root) {
    private var binding: PokemonItemBinding? = null

    init {
        this.binding = binding
    }

    fun setItem(model: PokemonDataModel) {
        binding?.let { view ->
            view.name = model.name
            Glide.with(view.root.context).load(model.img).into(view.imgCharacter)
        }
    }
}