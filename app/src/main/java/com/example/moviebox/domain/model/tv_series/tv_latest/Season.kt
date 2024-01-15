package com.example.moviebox.domain.model.tv_series.tv_latest

data class Season(
    val air_date: String,
    val episode_count: Int,
    val id: Int,
    val name: String,
    val overview: String,
    val poster_path: Any,
    val season_number: Int,
    val vote_average: Int
)