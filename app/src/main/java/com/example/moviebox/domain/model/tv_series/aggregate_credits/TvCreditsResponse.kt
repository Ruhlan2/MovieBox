package com.example.moviebox.domain.model.tv_series.aggregate_credits

data class TvCreditsResponse(
    val cast: List<com.example.moviebox.domain.model.tv_series.aggregate_credits.Cast>,
    val crew: List<com.example.moviebox.domain.model.tv_series.aggregate_credits.Crew>,
    val id: Int
)