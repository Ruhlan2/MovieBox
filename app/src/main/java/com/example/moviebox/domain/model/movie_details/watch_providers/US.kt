package com.example.moviebox.domain.model.movie_details.watch_providers

data class US(
    val buy: List<com.example.moviebox.domain.model.movie_details.watch_providers.Buy>,
    val link: String,
    //val rent: List<RentX>
)