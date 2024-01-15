package com.example.moviebox.domain.model.tv_series.tv_images

data class TvSeriesImagesResponse(
    val backdrops: List<com.example.moviebox.domain.model.tv_series.tv_images.Backdrop>,
    val id: Int,
    val logos: List<com.example.moviebox.domain.model.tv_series.tv_images.Logo>,
    val posters: List<com.example.moviebox.domain.model.tv_series.tv_images.Poster>
)