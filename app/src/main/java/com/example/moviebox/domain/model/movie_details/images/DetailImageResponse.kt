package com.example.moviebox.domain.model.movie_details.images

data class DetailImageResponse(
    val backdrops: List<com.example.moviebox.domain.model.movie_details.images.Backdrop>,
    val id: Int,
    val logos: List<com.example.moviebox.domain.model.movie_details.images.Logo>,
    val posters: List<com.example.moviebox.domain.model.movie_details.images.Poster>
)