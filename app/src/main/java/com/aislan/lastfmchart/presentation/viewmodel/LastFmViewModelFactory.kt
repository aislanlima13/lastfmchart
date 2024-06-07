package com.aislan.lastfmchart.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aislan.lastfmchart.domain.usecase.GetUserTopAlbumsUseCase

class LastFmViewModelFactory(
    private val getUserTopAlbumsUseCase: GetUserTopAlbumsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LastFmViewModel(
            getUserTopAlbumsUseCase
        ) as T
    }
}
