package com.aislan.lastfmchart.domain.usecase

import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.util.Resource
import com.aislan.lastfmchart.domain.repository.LastFmChartRepository

class GetUserTopAlbumsUseCase(private val repository: LastFmChartRepository) {
    suspend fun execute(
        user: String,
        period: String?,
        limit: Int?
    ): Resource<TopAlbums> =
        repository.getUserTopAlbums(user, period, limit)
}
