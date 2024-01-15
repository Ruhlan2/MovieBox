package com.example.moviebox.domain.model.movie_details.keyword

data class KeywordResponse(
    val id: Int,
    val keywords: List<com.example.moviebox.domain.model.movie_details.keyword.Keyword>
)