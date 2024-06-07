package com.aislan.lastfmchart.data.repository.datasource

import com.aislan.lastfmchart.data.model.TopAlbums
import retrofit2.Response

interface LastfmRemoteDataSource {
    suspend fun getTopAlbums(
        user: String,
        period: String?,
        limit: Int?
    ): Response<TopAlbums>
}