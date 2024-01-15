package com.example.moviebox.domain.model.tv_series.tv_watch_providers

data class US(
    val ads: List<com.example.moviebox.domain.model.tv_series.tv_watch_providers.Ad>,
    val free: List<com.example.moviebox.domain.model.tv_series.tv_watch_providers.Free>,
    val link: String
)