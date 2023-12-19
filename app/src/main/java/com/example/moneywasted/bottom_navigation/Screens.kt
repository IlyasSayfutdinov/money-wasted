package com.example.moneywasted.bottom_navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Screen1(){
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 1",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen2(){
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen3(){
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 3",
        textAlign = TextAlign.Center
    )
}

