package com.example.aventi.ui.card.infocard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aventi.R
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun AdventureActionList(adventureName: String, actionList: List<String>) {
    Box(
        modifier = Modifier
            .background(Color.Black.copy(alpha = .7f))
            .fillMaxWidth()
            .size(88.dp)
    ) {
        Column {
            Text(
                modifier = Modifier.padding(start = 16.dp, top = 16.dp),
                text = adventureName,
                fontSize = 19.sp,
                color = colorResource(R.color.action_name),
                fontWeight = FontWeight.SemiBold
            )
            Row (modifier = Modifier.padding(start = 16.dp, top = 8.dp)){
                actionList.forEach {
                    ActionElement(name = it)
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun AdventureActionListPreview() {
    AventiTheme {
        AdventureActionList(
            "Rockclimbing in Blue Mountain",
            listOf("Rockclimbing", "Hiking", "Exploring")
        )
    }
}
