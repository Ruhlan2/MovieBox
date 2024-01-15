package com.example.moviebox.domain.model.movie_lists.top_rated

data class TopRatedMovieResponse(
    val page: Int,
    val topRatedResults: List<TopRatedResult>,
    val total_pages: Int,
    val total_results: Int
)