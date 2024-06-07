package com.aislan.lastfmchart.data.repository.datasourceimpl

import com.aislan.lastfmchart.data.api.ApiService
import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.repository.datasource.LastfmRemoteDataSource
import retrofit2.Response

class LastfmRemoteDataSourceImpl(
    private val apiService: ApiService
): LastfmRemoteDataSource {
    override suspend fun getTopAlbums(
        user: String,
        period: String?,
        limit: Int?
    ): Response<TopAlbums> =
        apiService.getTopAlbums(user, period, limit)
}
