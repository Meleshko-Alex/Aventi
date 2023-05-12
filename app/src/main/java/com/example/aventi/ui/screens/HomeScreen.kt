package com.example.aventi.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aventi.R
import com.example.aventi.ui.card.infocard.AventiFooter
import com.example.aventi.ui.card.infocard.InfoCard
import com.example.aventi.ui.card.infocard.getMockAdventure
import com.example.aventi.ui.elements.navigation.actionbar.AventiActionBar
import com.example.aventi.ui.elements.navigation.navigation.BottomBarWithFab
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun HomeScreen() {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
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
            Spacer(modifier = Modifier.height(16.dp))

            Column(Modifier.fillMaxSize()) {
                InfoCard(imageBackground = R.drawable.pickture_mock_1)
                AventiFooter(getMockAdventure())
            }
        }

        BottomBarWithFab()
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    AventiTheme {
        HomeScreen()
    }
}