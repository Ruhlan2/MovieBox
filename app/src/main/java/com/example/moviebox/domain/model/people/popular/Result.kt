package com.example.moviebox.domain.model.people.popular

data class Result(
    val adult: Boolean,
    val gender: Int,
    val id: Int,
    val known_for: List<com.example.moviebox.domain.model.people.popular.KnownFor>,
    val known_for_department: String,
    val name: String,
    val original_name: String,
    val popularity: Double,
    val profile_path: String
)