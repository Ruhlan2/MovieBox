package com.example.moviebox.domain.model.movie_trending.trending_all

data class TrendingAllResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_trending.trending_all.Result>,
    val total_pages: Int,
    val total_results: Int
)