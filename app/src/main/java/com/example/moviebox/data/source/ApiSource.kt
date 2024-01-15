package com.example.moviebox.data.source

import com.example.moviebox.common.util.Resource
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedResult

interface ApiSource {

    suspend fun getPopularMovies():Resource<List<Result>>

    suspend fun getNowPlayingMovies():Resource<List<NowPlayingResult>>

    suspend fun getTopRatedMovies():Resource<List<TopRatedResult>>
}