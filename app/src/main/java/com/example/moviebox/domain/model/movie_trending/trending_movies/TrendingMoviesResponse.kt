package com.example.moviebox.domain.model.movie_trending.trending_movies

data class TrendingMoviesResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_trending.trending_movies.Result>,
    val total_pages: Int,
    val total_results: Int
)