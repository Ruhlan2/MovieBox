package com.example.moviebox.domain.model.tv_series.external_id

data class ExternalIdResponse(
    val facebook_id: String,
    val freebase_id: Any,
    val freebase_mid: Any,
    val id: Int,
    val imdb_id: String,
    val instagram_id: String,
    val tvdb_id: Int,
    val tvrage_id: Any,
    val twitter_id: String,
    val wikidata_id: String
)