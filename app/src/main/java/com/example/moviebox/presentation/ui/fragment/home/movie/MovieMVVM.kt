package com.example.moviebox.presentation.ui.fragment.home.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviebox.common.util.Resource
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedResult
import com.example.moviebox.domain.useCase.movieList.GetNowPlayingMoviesUseCase
import com.example.moviebox.domain.useCase.movieList.GetPopularMoviesUseCase
import com.example.moviebox.domain.useCase.movieList.GetTopRatedMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieMVVM @Inject constructor(
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase,
    private val getNowPlayingMoviesUseCase: GetNowPlayingMoviesUseCase,
    private val getTopRatedMoviesUseCase: GetTopRatedMoviesUseCase
):ViewModel() {

    private val _popularMovieList=MutableLiveData<Resource<List<Result>>>()
    val popularMovieList:LiveData<Resource<List<Result>>> =_popularMovieList

    private val _nowPlayingMovieList=MutableLiveData<Resource<List<NowPlayingResult>>>()
    val nowPlayingMovieList:LiveData<Resource<List<NowPlayingResult>>> =_nowPlayingMovieList

    private val _topRatedMoviesList=MutableLiveData<Resource<List<TopRatedResult>>>()
    val topRatedMoviesList:LiveData<Resource<List<TopRatedResult>>> =_topRatedMoviesList

    init {
        getMovies()
    }
    private fun getMovies(){
        getPopularMovies()
        getNowPlayingMovies()
        getTopRatedMovies()
    }

    private fun getTopRatedMovies() {
        viewModelScope.launch {
            getTopRatedMoviesUseCase().collectLatest {
                _topRatedMoviesList.value=it
            }
        }
    }

    private fun getPopularMovies(){
        viewModelScope.launch {
           getPopularMoviesUseCase().collectLatest {
                _popularMovieList.value=it
           }
        }
    }
    private fun getNowPlayingMovies(){
        viewModelScope.launch {
            getNowPlayingMoviesUseCase().collectLatest {
                _nowPlayingMovieList.value=it
            }
        }
    }
}