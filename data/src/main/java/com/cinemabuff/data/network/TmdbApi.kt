package com.cinemabuff.data.network

import com.cinemabuff.data.models.TopMovieListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbApi {

    @GET("movie/top_rated")
    fun getTopMovies(
            @Query("language") language: String = "en-US",
            @Query("page") page: Int = 1,
            @Query("region") region: String = "US"
    ): Single<TopMovieListResponse>

    companion object {
        const val TMDB_PAGE_SIZE = 20
    }
}