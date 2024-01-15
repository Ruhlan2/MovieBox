package com.example.moviebox.domain.useCase.movieList

import com.example.moviebox.domain.repository.ApiRepository
import javax.inject.Inject

class GetTopRatedMoviesUseCase @Inject constructor(
    private val repo:ApiRepository
) {
    suspend operator fun invoke()=repo.getTopRatedMovies()
}