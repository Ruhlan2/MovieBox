package com.example.moviebox.domain.model.movie_details.details

data class DetailResponse(
    val adult: Boolean,
    val backdrop_path: String,
    val belongs_to_collection: Any,
    val budget: Int,
    val genres: List<com.example.moviebox.domain.model.movie_details.details.Genre>,
    val homepage: String,
    val id: Int,
    val imdb_id: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val production_companies: List<com.example.moviebox.domain.model.movie_details.details.ProductionCompany>,
    val production_countries: List<com.example.moviebox.domain.model.movie_details.details.ProductionCountry>,
    val release_date: String,
    val revenue: Int,
    val runtime: Int,
    val spoken_languages: List<com.example.moviebox.domain.model.movie_details.details.SpokenLanguage>,
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)