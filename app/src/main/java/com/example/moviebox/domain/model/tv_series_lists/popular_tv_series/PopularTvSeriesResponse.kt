package com.example.moviebox.domain.model.tv_series_lists.popular_tv_series

data class PopularTvSeriesResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.tv_series_lists.popular_tv_series.Result>,
    val total_pages: Int,
    val total_results: Int
)