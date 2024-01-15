package com.example.moviebox.domain.model.movie_details.similar

data class SimilarResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_details.similar.Result>,
    val total_pages: Int,
    val total_results: Int
)