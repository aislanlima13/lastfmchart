package com.aislan.lastfmchart.domain.usecase

import com.aislan.lastfmchart.domain.repository.LastFmChartRepository

class ShareTopAlbumsResultUseCase(private val repository: LastFmChartRepository) {
    fun execute() {
        repository.shareTopAlbums()
    }
}
