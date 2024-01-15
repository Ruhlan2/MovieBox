package com.example.moviebox.domain.model.tv_series.aggregate_credits

data class Role(
    val character: String,
    val credit_id: String,
    val episode_count: Int
)