package com.aislan.lastfmchart.presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aislan.lastfmchart.presentation.ui.ui.theme.LastfmChartTheme

@Composable
fun LastFmChartComposeApp() {
    LastfmChartTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AddLastFmChartScreen()
        }
    }
}