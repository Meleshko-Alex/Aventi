package com.example.aventi.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aventi.R
import com.example.aventi.ui.elements.navigation.actionbar.AventiActionBar
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
        Column {
            AventiActionBar(
                avatar = R.drawable.mock_david_avatar,
                name = "Aventi",
                hasNotification = true
            )
            Icon(
                painter = painterResource(id = R.drawable.settings),
                contentDescription = null,
                modifier = Modifier.padding(start = 16.dp, top = 30.dp),
                tint = Color.White
            )
        }

        BottomBarWithFab()
    }
}