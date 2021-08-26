package com.example.jokesapp.data.remote.api

import com.example.jokesapp.data.remote.model.RandomJokes
import retrofit2.http.GET

interface JokesApi {

    @GET("random")
    suspend fun getRandomJokes(): RandomJokes
}