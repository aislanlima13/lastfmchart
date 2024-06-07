package com.aislan.lastfmchart.domain.repository

import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.util.Resource

interface LastFmChartRepository {
    suspend fun getUserTopAlbums(
        user: String,
        period: String?,
        limit: Int?
    ): Resource<TopAlbums>

    fun shareTopAlbums()
}
