package com.example.aventi.ui.card.infocard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(height = 495.dp, width = 200.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageBackground)
                .crossfade(true)
                .build(),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.FillBounds
        )

        AvatarAndName(R.drawable.mock_john_avatar, "John Smith")

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            AdventureActionList(
                "Rockclimbing in Blue Mountain",
                listOf("Rockclimbing", "Hiking", "Exploring")
            )
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