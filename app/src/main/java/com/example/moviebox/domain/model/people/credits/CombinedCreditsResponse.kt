package com.example.moviebox.domain.model.people.credits

data class CombinedCreditsResponse(
    val cast: List<Any>,
    val crew: List<com.example.moviebox.domain.model.people.credits.Crew>,
    val id: Int
)