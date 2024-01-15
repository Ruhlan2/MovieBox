package com.example.moviebox.domain.model.movie_details.translations

data class Translation(
    val `data`: com.example.moviebox.domain.model.movie_details.translations.Data,
    val english_name: String,
    val iso_3166_1: String,
    val iso_639_1: String,
    val name: String
)