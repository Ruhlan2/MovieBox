package com.example.moviebox.domain.model.movie_lists.upcoming

data class UpcomingMovieResponse(
    val dates: com.example.moviebox.domain.model.movie_lists.upcoming.Dates,
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_lists.upcoming.Result>,
    val total_pages: Int,
    val total_results: Int
)