package com.aislan.lastfmchart.presentation.di

import com.aislan.lastfmchart.data.api.ApiService
import com.aislan.lastfmchart.data.repository.datasource.LastfmRemoteDataSource
import com.aislan.lastfmchart.data.repository.datasourceimpl.LastfmRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideLastFmRemoteDataSource(apiService: ApiService): LastfmRemoteDataSource =
        LastfmRemoteDataSourceImpl(apiService)
}