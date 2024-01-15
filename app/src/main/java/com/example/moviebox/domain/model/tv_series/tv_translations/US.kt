package com.example.moviebox.domain.model.tv_series.tv_translations

data class US(
    val ads: List<com.example.moviebox.domain.model.tv_series.tv_translations.Ad>,
    val free: List<com.example.moviebox.domain.model.tv_series.tv_translations.Free>,
    val link: String
)