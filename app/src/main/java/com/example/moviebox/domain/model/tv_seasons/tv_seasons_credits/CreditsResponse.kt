package com.example.moviebox.domain.model.tv_seasons.tv_seasons_credits

data class CreditsResponse(
    val cast: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_credits.Cast>,
    val crew: List<com.example.moviebox.domain.model.tv_seasons.tv_seasons_credits.Crew>,
    val id: Int
)