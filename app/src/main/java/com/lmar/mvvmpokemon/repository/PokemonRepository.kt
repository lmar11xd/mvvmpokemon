package com.lmar.mvvmpokemon.repository

import com.lmar.mvvmpokemon.services.ApiService
import com.lmar.mvvmpokemon.services.RetrofitClient

class PokemonRepository {
    private var apiService: ApiService? = null

    init {
        apiService = RetrofitClient.getClient?.create(ApiService::class.java)
    }

    suspend fun getPokemon() = apiService?.getPokemons()
}