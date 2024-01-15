package com.example.moviebox.domain.model.movie_details.reviews

data class Result(
    val author: String,
    val author_details: com.example.moviebox.domain.model.movie_details.reviews.AuthorDetails,
    val content: String,
    val created_at: String,
    val id: String,
    val updated_at: String,
    val url: String
)