package com.example.myapplication1.ui.movieDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication1.R
import com.example.myapplication1.ui.components.TextHeaderBlack
import com.example.myapplication1.ui.components.TextSubtitleBlack
import com.example.myapplication1.ui.components.TextSubtitleGrey
import com.example.myapplication1.ui.components.TextTitleBlack

@Composable
fun MovieDetailsScreen(modifier: Modifier = Modifier) {
    Column() {
        MovieDetailHeader()
        MovieInfo(modifier = modifier.padding(horizontal = 16.dp))
    }

}

@Composable
fun MovieDetailHeader(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.dune),
            contentScale = ContentScale.Crop,
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Column(Modifier.padding(16.dp)) {
            TextHeaderBlack(text = "Avengers: Infinity War")
            TextSubtitleGrey(text = "2h29m • 16.12.2022")
            Spacer(Modifier.height(16.dp))
            TextTitleBlack("Review 4.8 (1.222)")
        }
    }
}

@Composable
fun MovieInfo(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row() {
            TextSubtitleGrey("Movie genre:", modifier = Modifier.width(120.dp))
            TextTitleBlack("Action, adventure, sci-fi")
        }
        Spacer(Modifier.height(8.dp))
        Row() {
            TextSubtitleGrey("Censorship:", modifier = Modifier.width(120.dp))
            TextTitleBlack("13+")
        }
        Spacer(Modifier.height(8.dp))
        Row() {
            TextSubtitleGrey("Languages:", modifier = Modifier.width(120.dp))
            TextTitleBlack("English, Hindi")
        }
        Spacer(Modifier.height(32.dp))
        TextHeaderBlack("Storyline")
        Spacer(Modifier.height(8.dp))
        TextSubtitleBlack("As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos.... See more")
        Spacer(Modifier.height(32.dp))
        CastSection()
        Spacer(Modifier.height(32.dp))
        CinemaTile()
    }
}

@Composable
fun CastSection(modifier: Modifier = Modifier) {
    Column() {
        TextHeaderBlack("Actor")
        Spacer(Modifier.height(8.dp))
        Row() {
            CastTile()
            CastTile()
        }
    }
}

@Composable
fun CastTile(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(end = 8.dp)
            .background(color = Color.DarkGray, shape = RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .background(color = colorResource(R.color.purple_500), shape = CircleShape)
                .size(36.dp)
        ) { TextSubtitleBlack() }
        Spacer(Modifier.width(8.dp))
        TextTitleBlack("Robert\n" + "Downey Jr.")
    }
}

@Composable
fun CinemaTile(modifier: Modifier = Modifier,) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
            .background(color = colorResource(R.color.yellow_fade), shape = RoundedCornerShape(8.dp))
            .border(color = colorResource(R.color.yellow_primary), width = 1.dp, shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        TextHeaderBlack("Aeon Mall CGV")
        TextSubtitleBlack("9.32 km | 27 Co Linh, Long Bien, Ha Noi")
    }
}
