package com.aislan.lastfmchart.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aislan.lastfmchart.data.model.TopAlbums
import com.aislan.lastfmchart.data.util.Resource
import com.aislan.lastfmchart.domain.usecase.GetUserTopAlbumsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LastFmViewModel(
    private val getUserTopAlbumsUseCase: GetUserTopAlbumsUseCase
): ViewModel() {
    val topAlbums: MutableLiveData<Resource<TopAlbums>> = MutableLiveData()

    fun getTopAlbums(user: String, period: String, limit: Int) = viewModelScope.launch(Dispatchers.IO) {
        topAlbums.postValue(Resource.Loading(null))

        try {
            val apiResult = getUserTopAlbumsUseCase.execute(user, period, limit)
            topAlbums.postValue(apiResult)
        } catch (e: Exception) {
            topAlbums.postValue(Resource.Error(e.message.toString(), null))
        }
    }
}
