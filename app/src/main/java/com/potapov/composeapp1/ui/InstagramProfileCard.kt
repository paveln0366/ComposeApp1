package com.potapov.composeapp1.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.potapov.composeapp1.R
import com.potapov.composeapp1.ui.theme.ComposeApp1Theme

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_instagram),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            UserStatistics(title = "Posts", value = "6,950")
            UserStatistics(title = "Followers", value = "436M")
            UserStatistics(title = "Following", value = "76")
        }
    }
}

@Composable
private fun UserStatistics(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    ComposeApp1Theme(
        darkTheme = false
    ) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    ComposeApp1Theme(
        darkTheme = true
    ) {
        InstagramProfileCard()
    }
}