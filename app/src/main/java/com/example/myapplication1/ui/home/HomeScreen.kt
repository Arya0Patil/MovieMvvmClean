package com.example.myapplication1.ui.home

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.alpha
import com.example.myapplication1.R
import com.example.myapplication1.ui.components.TextHeaderBlack
import com.example.myapplication1.ui.components.TextSubtitleBlack
import com.example.myapplication1.ui.components.TextSubtitleGrey
import com.example.myapplication1.ui.components.TextTitleBlack

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HomeScreenHeader()
        Spacer(Modifier.height(12.dp))
        CategorySection()
        MovieListRow(header = "Latest Movies", modifier = Modifier.padding(top = 18.dp))
        MovieListRow(header = "Favorite Movies",modifier = Modifier.padding(top = 18.dp))
    }
}

@Composable
fun HomeScreenHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(), verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            TextSubtitleGrey("Hey Arya!")
            Spacer(Modifier.height(2.dp))
            TextTitleBlack("Let's watch a movie")
        }
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(
                    color = androidx.compose.ui.graphics.Color(Color.CYAN),
                    shape = CircleShape
                )
        )
    }
}

@Composable
fun CategorySection(modifier: Modifier = Modifier) {

    Column(
    ) {
        Row() {
            TextHeaderBlack("Categories", modifier = Modifier.weight(1f))
            TextSubtitleBlack("View All", color = androidx.compose.ui.graphics.Color.Magenta)
        }
        Row() {
            CategoryTile()
            CategoryTile()
            CategoryTile()
        }
    }
}

@Composable
fun CategoryTile(modifier: Modifier = Modifier, categoryname: String = "Category") {
    Box(
        modifier = Modifier
            .padding(2.dp)
            .background(
                shape = RoundedCornerShape(10.dp),
                color = androidx.compose.ui.graphics.Color(Color.LTGRAY)
            )
            .padding(8.dp)
    ) {
        Text(categoryname, color = colorResource(R.color.purple_500))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        HomeScreenHeader(Modifier)
        CategorySection()
        CategoryTile()
    }
}

@Composable
fun MovieListRow(modifier: Modifier = Modifier, header:String) {
    Column(modifier =modifier) {
        Row() {
            TextHeaderBlack(header, modifier = Modifier.weight(1f))
            TextSubtitleBlack("View All", color = androidx.compose.ui.graphics.Color.Magenta)
        }
        Spacer(Modifier.height(8.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            MovieTile(image = painterResource(R.drawable.lordofwar), title = "Lord Of War")
            MovieTile(image = painterResource(R.drawable.dune), title = "Dune")
        }
    }
}

@Composable
fun MovieTile(modifier: Modifier = Modifier, image: Painter, title:String) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .height(220.dp)
                .width(170.dp)
                .background(
                    color = androidx.compose.ui.graphics.Color.Transparent,
                    shape = RoundedCornerShape(18.dp)
                )
                .padding(5.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(18.dp))   // Rounded image corners
            )
        }
        TextSubtitleBlack(title, modifier = Modifier.padding(start = 8.dp))
    }

}