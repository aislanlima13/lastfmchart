package com.aislan.lastfmchart.data.repository.datasourceimpl

import com.aislan.lastfmchart.data.api.ApiService
import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.repository.datasource.LastfmRemoteDataSource
import retrofit2.Response

class LastfmRemoteDataSourceImpl(
    private val apiService: ApiService,
    private val user: String,
    private val period: String?,
    private val limit: Int?
): LastfmRemoteDataSource {
    override suspend fun getTopAlbums(): Response<TopAlbums> =
        apiService.getTopAlbums(user, period, limit)
}
