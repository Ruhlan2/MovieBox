package com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits

data class SeasonCreditsResponse(
    val cast: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits.Cast>,
    val crew: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits.Crew>,
    val id: Int
)