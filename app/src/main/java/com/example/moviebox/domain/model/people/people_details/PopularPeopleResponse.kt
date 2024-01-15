package com.example.moviebox.domain.model.people.people_details

data class PopularPeopleResponse(
    val adult: Boolean,
    val also_known_as: List<String>,
    val biography: String,
    val birthday: Any,
    val deathday: Any,
    val gender: Int,
    val homepage: Any,
    val id: Int,
    val imdb_id: String,
    val known_for_department: String,
    val name: String,
    val place_of_birth: Any,
    val popularity: Double,
    val profile_path: Any
)