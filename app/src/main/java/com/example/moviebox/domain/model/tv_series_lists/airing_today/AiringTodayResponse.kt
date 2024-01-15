package com.example.moviebox.domain.model.tv_series_lists.airing_today

data class AiringTodayResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.tv_series_lists.airing_today.Result>,
    val total_pages: Int,
    val total_results: Int
)