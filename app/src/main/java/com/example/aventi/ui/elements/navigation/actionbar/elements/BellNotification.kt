package com.example.aventi.ui.elements.navigation.actionbar.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aventi.R
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun BellNotification(hasNotification: Boolean) {
    Box(modifier = Modifier.size(26.dp, 30.dp)) {
        // Bell icon
        Image(
            painter = painterResource(R.drawable.bell),
            contentDescription = "Bell icon",
            modifier = Modifier
                .align(Alignment.BottomStart)
        )

        // Notification circle
        if (hasNotification) {
            Box(
                modifier = Modifier
                    .size(9.dp)
                    .background(colorResource(R.color.fab), shape = CircleShape)
                    .align(Alignment.TopEnd)
            ) {
            }
        }
    }
}

@Preview
@Composable
fun BellNotificationPreview() {
    AventiTheme {
        BellNotification(true)
    }
}