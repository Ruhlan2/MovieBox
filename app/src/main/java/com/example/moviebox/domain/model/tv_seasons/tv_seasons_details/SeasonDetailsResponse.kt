package com.example.moviebox.domain.model.tv_seasons.tv_seasons_details

data class SeasonDetailsResponse(
    val _id: String,
    val air_date: String,
    val episodes: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_details.Episode>,
    val id: Int,
    val name: String,
    val overview: String,
    val poster_path: String,
    val season_number: Int,
    val vote_average: Double
)