package com.example.aventi.ui.card.infocard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun ActionElement(
    name: String,
    textColor: Color = Color.Black,
    backgroundColor: Color = Color.White,
    backgroundAlpha: Float = 1f
) {
    Column(
        modifier = Modifier
            .background(
                backgroundColor.copy(alpha = backgroundAlpha), shape = RoundedCornerShape(20.dp)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(10.dp, 2.dp, 10.dp, 2.dp),
            text = name, color = textColor, fontSize = 13.sp
        )
    }
}

@Preview
@Composable
fun ActionElementPreview() {
    AventiTheme {
        ActionElement(name = "Rockclimbing", backgroundColor = Color.Yellow)
    }
}