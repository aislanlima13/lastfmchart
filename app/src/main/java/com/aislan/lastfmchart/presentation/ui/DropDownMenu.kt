package com.aislan.lastfmchart.presentation.ui

import androidx.compose.runtime.Composable
import com.aislan.lastfmchart.util.getTimespan

@Composable
fun DropDownMenu(timespan: (String) -> Unit) {
    val options = getTimespan().map { it.time }
}