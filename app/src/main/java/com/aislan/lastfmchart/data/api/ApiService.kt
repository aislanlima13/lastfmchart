package com.aislan.lastfmchart.data.api

import com.aislan.lastfmchart.BuildConfig
import com.aislan.lastfmchart.data.model.TopAlbums
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("?method=user.gettopalbums&format=json")
    suspend fun getTopAlbums(
        @Query("user") user: String,
        @Query("period") period: String?,
        @Query("limit") limit: Int?,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): Response<TopAlbums>
}
