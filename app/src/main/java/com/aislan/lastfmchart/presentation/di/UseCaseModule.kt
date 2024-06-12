package com.aislan.lastfmchart.presentation.di

import com.aislan.lastfmchart.domain.repository.LastFmChartRepository
import com.aislan.lastfmchart.domain.usecase.GetUserTopAlbumsUseCase
import com.aislan.lastfmchart.domain.usecase.ShareTopAlbumsResultUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideUserTopAlbumsUseCase(
        repository: LastFmChartRepository
    ): GetUserTopAlbumsUseCase =
        GetUserTopAlbumsUseCase(repository)

    @Singleton
    @Provides
    fun provideShareTopAlbums(
        repository: LastFmChartRepository
    ): ShareTopAlbumsResultUseCase =
        ShareTopAlbumsResultUseCase(repository)
}
