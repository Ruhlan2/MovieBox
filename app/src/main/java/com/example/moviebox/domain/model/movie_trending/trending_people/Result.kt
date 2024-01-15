package com.example.moviebox.domain.model.movie_trending.trending_people

data class Result(
    val adult: Boolean,
    val gender: Int,
    val id: Int,
    val known_for: List<com.example.moviebox.domain.model.movie_trending.trending_people.KnownFor>,
    val known_for_department: String,
    val media_type: String,
    val name: String,
    val original_name: String,
    val popularity: Double,
    val profile_path: String
)