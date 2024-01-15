package com.example.moviebox.domain.model.movie_lists.popular_movies

data class PopularMovieResponse(
    val page: Int?,
    val results: List<Result>?,
    val total_pages: Int?,
    val total_results: Int?
)