package com.example.moviebox.domain.model.tv_series.alternative_titles

data class TvAlternativeResponse(
    val id: Int,
    val results: List<com.example.moviebox.domain.model.tv_series.alternative_titles.Result>
)