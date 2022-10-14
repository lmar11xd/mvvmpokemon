package com.lmar.mvvmpokemon.services

import com.lmar.mvvmpokemon.model.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("pokedex.json")
    suspend fun getPokemons(): Response<PokemonResponse>
}