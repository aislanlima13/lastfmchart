package com.aislan.lastfmchart.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.aislan.lastfmchart.util.Timespan

@Composable
fun AddLastFmChartScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        var userName = ""
        var nrAlbumsXAxis = "0"
        var nrAlbumsYAxis = "0"

        TextField(
            value = userName, 
            onValueChange = { userName = it },
            placeholder = { Text(text = "LastFM username") },
            modifier = Modifier.fillMaxSize())
        
        Spacer(modifier = Modifier.padding(8.dp))

        Column {
            Text(text = "Timespan:")
            DropDownMenu {
                Timespan.ALL_TIME
            }
        }

        Spacer(modifier = Modifier.padding(8.dp))
        
        Column {
            Text(text = "Nr of albums x axis (max 20):")
            TextField(
                value = nrAlbumsXAxis,
                onValueChange = { nrAlbumsXAxis = it },
                placeholder = { Text(text = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxSize())
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Column {
            Text(text = "Nr of albums y axis (max 20):")
            TextField(
                value = nrAlbumsYAxis,
                onValueChange = { nrAlbumsYAxis = it },
                placeholder = { Text(text = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxSize())
        }

    }
}