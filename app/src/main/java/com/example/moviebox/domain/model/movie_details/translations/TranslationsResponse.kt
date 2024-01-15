package com.example.moviebox.domain.model.movie_details.translations

data class TranslationsResponse(
    val id: Int,
    val translations: List<com.example.moviebox.domain.model.movie_details.translations.Translation>
)