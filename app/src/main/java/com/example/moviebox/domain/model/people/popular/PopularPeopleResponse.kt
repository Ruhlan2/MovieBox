package com.example.moviebox.domain.model.people.popular

data class PopularPeopleResponse(
    val page: Int,
    val results: List<com.example.moviebox.domain.model.people.popular.Result>,
    val total_pages: Int,
    val total_results: Int
)