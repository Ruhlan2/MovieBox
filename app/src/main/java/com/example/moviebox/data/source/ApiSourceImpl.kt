package com.example.moviebox.data.source

import com.example.moviebox.common.util.Resource
import com.example.moviebox.common.util.findExceptionMessage
import com.example.moviebox.data.service.Service
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedResult
import retrofit2.Response
import javax.inject.Inject

class ApiSourceImpl @Inject constructor(
    private val service:Service
):ApiSource {


    override suspend fun getPopularMovies(): Resource<List<Result>> {
        return try {
            val response=service.getPopularMovies()
            if (response.isSuccessful){
                response.body()?.let {
                    Resource.success(it.results)
                }?:Resource.error("Error",null)
            }else{
                Resource.error(findExceptionMessage(response.errorBody()),null)
            }
        }catch (e:Exception){
            Resource.error(e.localizedMessage as String,null)
        }
    }

    override suspend fun getNowPlayingMovies(): Resource<List<NowPlayingResult>> {
        return try {
            val response=service.getNowPlayingMovies()
            if (response.isSuccessful){
                response.body()?.let {
                    Resource.success(it.nowPlayingResults)
                }?:Resource.error("Error",null)
            } else{
                Resource.error(findExceptionMessage(response.errorBody()),null)
            }
        }catch (e:Exception){
            Resource.error(e.localizedMessage as String, null)
        }
    }

    override suspend fun getTopRatedMovies(): Resource<List<TopRatedResult>> {
        return try {
            val response=service.getTopRatedMovies()
            if (response.isSuccessful){
                response.body()?.let {
                    Resource.success(it.topRatedResults)
                }?:Resource.error("Error",null)
            }else{
                Resource.error(findExceptionMessage(response.errorBody()),null)
            }
        }catch (e:Exception){
            Resource.error(e.localizedMessage as String,null)
        }
    }

}