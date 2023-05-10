package com.example.aventi.ui.elements.navigation.actionbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.aventi.R
import com.example.aventi.ui.elements.navigation.actionbar.elements.BellNotification
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun AventiActionBar(avatar: ImageBitmap, name: String, hasNotification: Boolean) {
    Row(
        modifier = Modifier
            //.size(height = 30.dp, width = )
            .padding(top = 66.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Round avatar
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(R.drawable.mock_david_avatar)
                .crossfade(true)
                .build(),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )


        /*AsyncImage(
            bitmap = avatar,
            contentDescription = "Avatar",
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )*/

        // Text in the middle - Aventi
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = name,
            color = Color.White,
            //fontFamily = FontFamily(Font(R.font.aventi)),
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold,
            /*modifier = Modifier
                .padding(end = 16.dp)
                .weight(1f)*/
        )

        // Image at the end - indented by 16dp, 16dp by 16dp
        Spacer(modifier = Modifier.weight(1f))
        BellNotification(hasNotification = hasNotification)
    }
}

@Preview
@Composable
fun BellNotificationPreview() {
    AventiTheme {
        AventiActionBar(
            avatar = ImageBitmap.imageResource(R.drawable.mock_david_avatar),
            name = "Aventi",
            hasNotification = true
        )
    }
}
