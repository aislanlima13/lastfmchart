package com.aislan.lastfmchart.presentation.di

import com.aislan.lastfmchart.data.repository.LastFmChartRepositoryImpl
import com.aislan.lastfmchart.data.repository.datasource.LastfmRemoteDataSource
import com.aislan.lastfmchart.domain.repository.LastFmChartRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideLastFmRepository(lastfmRemoteDataSource: LastfmRemoteDataSource): LastFmChartRepository =
        LastFmChartRepositoryImpl(lastfmRemoteDataSource)
}