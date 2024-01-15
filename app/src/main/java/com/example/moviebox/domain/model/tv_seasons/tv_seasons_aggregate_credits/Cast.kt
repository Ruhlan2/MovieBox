package com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits

data class Cast(
    val adult: Boolean,
    val gender: Int,
    val id: Int,
    val known_for_department: String,
    val name: String,
    val order: Int,
    val original_name: String,
    val popularity: Double,
    val profile_path: String,
    val roles: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits.Role>,
    val total_episode_count: Int
)