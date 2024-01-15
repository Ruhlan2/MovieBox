package com.example.moviebox.data.service

import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingMovieResponse
import com.example.moviebox.domain.model.movie_lists.popular_movies.PopularMovieResponse
import com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedMovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query


interface Service{

    //Movie Lists

    @GET("movie/popular")
    suspend fun getPopularMovies():Response<PopularMovieResponse>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies():Response<NowPlayingMovieResponse>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies():Response<TopRatedMovieResponse>

    @GET("movie/upcoming/")
    suspend fun getUpComingMovies(@Header("Authorization") auth:String,@Query("language") language: String):Response<com.example.moviebox.domain.model.movie_lists.upcoming.UpcomingMovieResponse>

    //Movies

    @GET("movie/{movie_id}/")
    suspend fun getMovieDetails(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.details.DetailResponse>

    @GET("movie/{movie_id}/images/")
    suspend fun getMoviePosterImages(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.images.DetailImageResponse>

    @GET("movie/{movie_id}/keywords/")
    suspend fun getMovieKeywords(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.keyword.KeywordResponse>

    @GET("movie/latest/")
    suspend fun getLatestMovies(@Header("Authorization") auth:String,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.latest.LatestMovieResponse>

    @GET("movie/{movie_id}/reviews/")
    suspend fun getMovieReviews(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.reviews.ReviewsResponse>

    @GET("movie/{movie_id}/similar/")
    suspend fun getMovieSimilarities(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.similar.SimilarResponse>

    @GET("movie/{movie_id}/translations/")
    suspend fun getMovieTranslations(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.translations.TranslationsResponse>

    @GET("movie/{movie_id}/videos/")
    suspend fun getMovieVideos(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.videos.VideoResponse>

    @GET("movie/{movie_id}/watch/")
    suspend fun getWatchProviders(@Header("Authorization") auth:String,@Path("movie_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.watch_providers.WatchProviderResponse>


    //Person

    @GET("person/popular")
    suspend fun getPopularPeople(@Header("Authorization") auth:String,@Query("language") language: String):Response<com.example.moviebox.domain.model.people.popular.PopularPeopleResponse>

    @GET("person/{person_id}")
    suspend fun getPeopleDetails(@Header("Authorization") auth:String,@Path("person_id") id:Int,@Query("language") language: String):Response<com.example.moviebox.domain.model.people.popular.PopularPeopleResponse>

    @GET("person/{person_id}/combined_credits")
    suspend fun getCombinedCredits(@Header("Authorization") auth:String,@Path("person_id") id:Int,@Query("language") language: String):Response<com.example.moviebox.domain.model.people.credits.CombinedCreditsResponse>

    //Trending

    @GET("trending/all/{time}")
    suspend fun getTrendingAll(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time:String):Response<com.example.moviebox.domain.model.movie_trending.trending_all.TrendingAllResponse>

    @GET("trending/movie/{time}")
    suspend fun getTrendingMovies(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time:String):Response<com.example.moviebox.domain.model.movie_trending.trending_movies.TrendingMoviesResponse>

    @GET("trending/person/{time}")
    suspend fun getTrendingPerson(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time:String):Response<com.example.moviebox.domain.model.movie_trending.trending_people.TrendingPeopleResponse>

    @GET("trending/tv/{time}")
    suspend fun getTrendingTvSeries(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time:String):Response<com.example.moviebox.domain.model.movie_trending.trending_movies.TrendingMoviesResponse>

    //TV Series Lists

    @GET("tv/airing_today")
    suspend fun getAiringTodaySeries(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time:String):Response<com.example.moviebox.domain.model.tv_series_lists.airing_today.AiringTodayResponse>

    @GET("tv/on_the_air")
    suspend fun getOnTheAirSeries(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time: String):Response<com.example.moviebox.domain.model.tv_series_lists.on_the_air.OnTheAirResponse>

    @GET("tv/popular")
    suspend fun popularTvSeries(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time: String):Response<com.example.moviebox.domain.model.tv_series_lists.popular_tv_series.PopularTvSeriesResponse>

    @GET("tv/top_rated")
    suspend fun topRatedTvSeries(@Header("Authorization") auth:String,@Query("language") language: String,@Path("time") time: String):Response<com.example.moviebox.domain.model.movie_lists.top_rated.TopRatedMovieResponse>


    //Tv Series

    @GET("tv/{series_id}")
    suspend fun getTvSeriesDetails(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.tv_details.TvDetailsResponse>

    @GET("tv/{series_id}/aggregate_credits")
    suspend fun getAggregateCredits(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.aggregate_credits.TvCreditsResponse>

    @GET("tv/{series_id}/alternative_titles")
    suspend fun getAlternativeTitles(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.alternative_titles.TvAlternativeResponse>

    @GET("tv/{series_id}/changes")
    suspend fun getChanges(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.changes.TvChangesResponse>

    @GET("tv/{series_id}/external_ids")
    suspend fun getExternalID(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.external_id.ExternalIdResponse>

    //Images
    @GET("tv/{series_id}/images")
    suspend fun getTvSeriesImages(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.tv_images.TvSeriesImagesResponse>

    @GET("tv/{series_id}/keywords")
    suspend fun getTvSeriesKeywords(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.keyword.KeywordResponse>

    @GET("tv/{series_id}/latest")
    suspend fun getLatestTvSeries(@Header("Authorization") auth:String,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.tv_latest.LatestTvResponse>

    @GET("tv/{series_id}/recommendations")
    suspend fun getTvSeriesRecommendations(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.tv_recommendations.TvRecommendationsResponse>

    /*


    @GET("tv/{series_id}/reviews")
    suspend fun getTvSeriesReviews(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<TvRecommendationsResponse>

     */


    @GET("tv/{series_id}/similar")
    suspend fun getSimilarTvSeries(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.similar.SimilarResponse>

    @GET("tv/{series_id}/translations")
    suspend fun getTranslations(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.movie_details.translations.TranslationsResponse>

    @GET("tv/{series_id}/watch/providers")
    suspend fun getTvWatchProviders(@Header("Authorization") auth:String,@Path("series_id") id:Int,@Query("language") language:String):Response<com.example.moviebox.domain.model.tv_series.tv_translations.TvWatchProvidersResponse>

    //Tv episodes

    @GET("tv/season/{season_number}")
    suspend fun getTvSeasonDetails(@Header("Authorization") auth:String,@Path("season_number") number:Int):Response<com.example.moviebox.domain.model.tv_seasons.tv_seasons_details.SeasonDetailsResponse>

    @GET("tv/season/{season_number}/aggregate_credits")
    suspend fun getTvSeasonAggregateCredits(@Header("Authorization") auth:String,@Path("season_number") number:Int):Response<com.example.moviebox.domain.model.tv_seasons.tv_seasons_aggregate_credits.SeasonCreditsResponse>

    @GET("tv/{series_id}/season/{season_number}/credits")
    suspend fun getTvSeasonCredits(@Header("Authorization") auth:String,@Path("season_number") number:Int):Response<com.example.moviebox.domain.model.tv_seasons.tv_seasons_credits.CreditsResponse>

    @GET("tv/season/{season_number}")
    suspend fun getTvSeasonsVideos(@Header("Authorization") auth:String,@Path("season_number") number:Int):Response<com.example.moviebox.domain.model.tv_seasons.tv_seasons_videos.TvSeasonsVideos>
}