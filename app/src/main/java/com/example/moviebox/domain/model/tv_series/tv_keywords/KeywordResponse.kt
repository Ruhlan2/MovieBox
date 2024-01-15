package com.example.moviebox.domain.model.tv_series.tv_keywords

data class KeywordResponse(
    val id: Int,
    val results: List<com.example.moviebox.domain.model.tv_series.tv_keywords.Result>
)