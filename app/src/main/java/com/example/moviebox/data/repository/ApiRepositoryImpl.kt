package com.example.moviebox.data.repository

import com.example.moviebox.common.util.Resource
import com.example.moviebox.common.util.Status
import com.example.moviebox.data.source.ApiSource
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedResult
import com.example.moviebox.domain.repository.ApiRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ApiRepositoryImpl(
    private val apiSource: ApiSource
) :ApiRepository{
    override suspend fun getPopularMovies(): Flow<Resource<List<Result>>> = flow{
        emit(Resource.loading(null))
        val response=apiSource.getPopularMovies()
        when(response.status){
            Status.ERROR->emit(Resource.error(response.message?:"Error",null))
            Status.SUCCESS->emit(Resource.success(response.data?: emptyList()))
            else->{}
        }
    }

    override suspend fun getNowPlayingMovies(): Flow<Resource<List<NowPlayingResult>>> =flow{
        emit(Resource.loading(null))
        val response=apiSource.getNowPlayingMovies()
        when(response.status){
            Status.ERROR->emit(Resource.error(response.message?:"Error",null))
            Status.SUCCESS->emit(Resource.success(response.data?: emptyList()))
            else->{}
        }
    }

    override suspend fun getTopRatedMovies(): Flow<Resource<List<TopRatedResult>>> = flow{
        emit(Resource.loading(null))
        val response=apiSource.getTopRatedMovies()
        when(response.status){
            Status.ERROR->emit(Resource.error(response.message?:"Error",null))
            Status.SUCCESS->emit(Resource.success(response.data))
            else->{}
        }
    }


}