package com.example.moviebox.domain.model.movie_details.reviews

data class ReviewsResponse(
    val id: Int,
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_details.reviews.Result>,
    val total_pages: Int,
    val total_results: Int
)