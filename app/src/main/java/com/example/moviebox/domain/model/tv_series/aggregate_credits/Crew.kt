package com.example.moviebox.domain.model.tv_series.aggregate_credits

data class Crew(
    val adult: Boolean,
    val department: String,
    val gender: Int,
    val id: Int,
    val jobs: List<com.example.moviebox.domain.model.tv_series.aggregate_credits.Job>,
    val known_for_department: String,
    val name: String,
    val original_name: String,
    val popularity: Double,
    val profile_path: Any,
    val total_episode_count: Int
)