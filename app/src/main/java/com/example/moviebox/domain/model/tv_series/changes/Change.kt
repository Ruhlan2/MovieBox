package com.example.moviebox.domain.model.tv_series.changes

data class Change(
    val items: List<com.example.moviebox.domain.model.tv_series.changes.Item>,
    val key: String
)