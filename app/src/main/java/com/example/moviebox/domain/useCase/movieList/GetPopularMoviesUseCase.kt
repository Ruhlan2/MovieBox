package com.example.moviebox.domain.useCase.movieList

import com.example.moviebox.domain.repository.ApiRepository
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(private val repo:ApiRepository){

    suspend operator fun invoke()=repo.getPopularMovies()
}