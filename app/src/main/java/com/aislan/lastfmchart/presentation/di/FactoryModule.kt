package com.aislan.lastfmchart.presentation.di

import com.aislan.lastfmchart.domain.usecase.GetUserTopAlbumsUseCase
import com.aislan.lastfmchart.presentation.viewmodel.LastFmViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideViewModelFactory(
        getUserTopAlbumsUseCase: GetUserTopAlbumsUseCase
    ): LastFmViewModelFactory =
        LastFmViewModelFactory(getUserTopAlbumsUseCase)
}
