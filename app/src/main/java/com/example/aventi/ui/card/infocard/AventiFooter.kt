package com.example.aventi.ui.card.infocard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.aventi.R
import com.example.aventi.models.Adventure
import com.example.aventi.models.User
import com.example.aventi.ui.theme.AventiTheme

@Composable
fun AventiFooter(adventure: Adventure) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 16.dp, end = 20.dp)
    ) {
        Row {
            val eventType = if (adventure.isPrivate) "Private" else "Public"
            Text(text = "$eventType Aventi", color = Color.White, fontSize = 13.sp)

            Spacer(modifier = Modifier.weight(1f))
            Text(text = adventure.date, color = Color.White, fontSize = 13.sp)

            Spacer(modifier = Modifier.weight(1f))
            Text(text = "${adventure.distance / 1000} km", color = Color.White, fontSize = 13.sp)
        }

        Box(
            Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Divider(
                color = Color.White,
                thickness = 2.dp
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 22.dp)
        ) {

            Box {
                adventure.participant.forEachIndexed {index, element ->
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(element.avatar)
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = (index * 21).dp)
                            .size(32.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))
            Text(text = "${adventure.participant.size + 1}", color = Color.White, fontSize = 16.sp)
        }
    }
}

@Preview
@Composable
fun AventiFooterPreview() {
    AventiTheme {
        AventiFooter(getMockAdventure())
    }
}

fun getMockAdventure(): Adventure {
    return Adventure(
        isPrivate = true,
        date = "WED, JAN 26 @ 6:15PM",
        distance = 22000,
        getMockUserList()
    )
}

fun getMockUserList(): List<User> {
    val user1 = User("f1", "l1", R.drawable.user_1_mock)
    val user2 = User("f2", "l2", R.drawable.user_2_mock)
    val user3 = User("f3", "l3", R.drawable.user_3_mock)

    return listOf(user1, user2, user3)
}
