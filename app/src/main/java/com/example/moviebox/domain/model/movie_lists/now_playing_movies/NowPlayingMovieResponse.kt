package com.example.moviebox.domain.model.movie_lists.now_playing_movies

data class NowPlayingMovieResponse(
    val dates: Dates?,
    val page: Int?,
    val nowPlayingResults: List<NowPlayingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)