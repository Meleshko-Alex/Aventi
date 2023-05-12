package com.example.aventi.ui.card.infocard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.aventi.R
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun InfoCard(imageBackground: Int) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp, end = 2.dp)
            .size(height = 420.dp, width = 200.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageBackground)
                .crossfade(true)
                .build(),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column {
            AvatarAndName(R.drawable.mock_john_avatar, "John Smith")

            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
                AdventureActionList(
                    "Rockclimbing in Blue Mountain",
                    listOf("Rockclimbing", "Hiking", "Exploring")
                )
            }
        }
    }
}

@Preview
@Composable
fun InfoCardPreview() {
    AventiTheme {
        InfoCard(R.drawable.pickture_mock_1)
    }
}