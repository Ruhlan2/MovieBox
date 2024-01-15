package com.example.moviebox.domain.model.movie_details.videos

data class VideoResponse(
    val id: Int,
    val results: List<com.example.moviebox.domain.model.movie_details.videos.Result>
)