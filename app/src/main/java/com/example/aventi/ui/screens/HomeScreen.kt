package com.example.aventi.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.aventi.R
import com.example.aventi.ui.elements.navigation.navigation.BottomBarWithFab

@Composable
fun HomeScreen() {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
                    // Replace with your image id
                    painterResource(id = R.drawable.blurred_background),
                    contentScale = ContentScale.FillBounds
                )

        })
    {
        // Add more views here!
        Text("Hello Stack!")
        BottomBarWithFab()
    }
}