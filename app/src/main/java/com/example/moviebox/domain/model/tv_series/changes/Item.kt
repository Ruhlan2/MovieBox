package com.example.moviebox.domain.model.tv_series.changes

data class Item(
    val action: String,
    val id: String,
    val iso_3166_1: String,
    val iso_639_1: String,
    val time: String,
    val value: com.example.moviebox.domain.model.tv_series.changes.Value
)