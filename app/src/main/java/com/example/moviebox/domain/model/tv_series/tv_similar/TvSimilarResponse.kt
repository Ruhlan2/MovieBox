package com.example.moviebox.domain.model.tv_series.tv_similar

data class TvSimilarResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.tv_series.tv_similar.Result>,
    val total_pages: Int,
    val total_results: Int
)