package com.example.moviebox.data.mapper

import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result

fun List<Result>.toResultModel()= map {
    with(it){
        Result(
            adult,
            backdrop_path,
            genre_ids,
            id,
            original_language,
            original_title,
            overview,
            popularity,
            poster_path,
            release_date,
            title,
            video,
            vote_average,
            vote_count
        )
    }
}

fun List<NowPlayingResult>.toNowModel()=map {
    with(it){
           NowPlayingResult(
               adult,
               backdrop_path,
               genre_ids,
               id,
               original_language,
               original_title,
               overview,
               popularity,
               poster_path,
               release_date,
               title,
               video,
               vote_average,
               vote_count
           )
    }
}
