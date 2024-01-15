package com.example.moviebox.domain.model.tv_series_lists.on_the_air

data class OnTheAirResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.tv_series_lists.on_the_air.Result>,
    val total_pages: Int,
    val total_results: Int
)