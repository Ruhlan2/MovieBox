package com.example.moviebox.domain.model.movie_trending.trending_people

data class TrendingPeopleResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.movie_trending.trending_people.Result>,
    val total_pages: Int,
    val total_results: Int
)