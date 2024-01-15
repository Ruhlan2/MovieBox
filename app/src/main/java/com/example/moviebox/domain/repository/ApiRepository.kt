package com.example.moviebox.domain.repository

import com.example.moviebox.common.util.Resource
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedResult
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    suspend fun getPopularMovies():Flow<Resource<List<Result>>>

    suspend fun getNowPlayingMovies():Flow<Resource<List<NowPlayingResult>>>

    suspend fun getTopRatedMovies():Flow<Resource<List<TopRatedResult>>>
}