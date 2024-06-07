package com.aislan.lastfmchart.data.repository

import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.repository.datasource.LastfmRemoteDataSource
import com.aislan.lastfmchart.data.util.Resource
import com.aislan.lastfmchart.domain.repository.LastFmChartRepository
import retrofit2.Response

class LastFmChartRepositoryImpl(
    private val lastfmRemoteDataSource: LastfmRemoteDataSource
): LastFmChartRepository {
    override suspend fun getUserTopAlbums(
        user: String,
        period: String?,
        limit: Int?
    ): Resource<TopAlbums> {
        return responseToResource(lastfmRemoteDataSource.getTopAlbums(
            user,
            period,
            limit
        ))
    }

    private fun responseToResource(response: Response<TopAlbums>): Resource<TopAlbums> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message(), null)
    }

    override fun shareTopAlbums() {
        TODO("Not yet implemented")
    }
}