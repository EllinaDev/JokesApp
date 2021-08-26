package com.example.jokesapp.data.remote.model

import com.google.gson.annotations.SerializedName

data class RandomJokes(
    val type: String,
    @SerializedName("value")
    val joke: Joke,
    val categories: String
)

data class Joke(
    val id: Int,
    val joke: String
)
