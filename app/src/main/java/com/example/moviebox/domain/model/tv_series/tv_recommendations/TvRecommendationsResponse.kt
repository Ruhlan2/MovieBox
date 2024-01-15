package com.example.moviebox.domain.model.tv_series.tv_recommendations

data class TvRecommendationsResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.tv_series.tv_recommendations.Result>,
    val total_pages: Int,
    val total_results: Int
)