package com.aislan.lastfmchart.presentation.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.aislan.lastfmchart.presentation.viewmodel.LastFmViewModel
import com.aislan.lastfmchart.presentation.viewmodel.LastFmViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var factory: LastFmViewModelFactory
    lateinit var viewModel: LastFmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewModel()
        observer()
        viewModel.getTopAlbums("AislanLima", "7day", 1)

        enableEdgeToEdge()
        setContent {
            LastFmChartComposeApp()
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, factory)[LastFmViewModel::class.java]
    }

    private fun observer() {
        viewModel.topAlbums.observe(this) {
            Log.i("top_album", it.data?.topalbums!!.album[0].name)
        }
    }
}

@Preview
@Composable
fun Preview() {
    LastFmChartComposeApp()
}