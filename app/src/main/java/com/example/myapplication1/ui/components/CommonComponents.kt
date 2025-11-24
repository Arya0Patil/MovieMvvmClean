package com.example.myapplication1.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextHeaderBlack(text: String = "", modifier: Modifier = Modifier) {
    Text(text = text, modifier = modifier, fontSize = 24.sp, style = TextStyle(fontWeight = FontWeight.Medium))
}

@Composable
fun TextSubtitleBlack(text: String = "", modifier: Modifier = Modifier, color: Color = Color.Unspecified) {
    Text(text = text, modifier = modifier,  fontSize = 16.sp, color = color)
}

@Composable
fun TextSubtitleGrey(text: String = "", modifier: Modifier = Modifier) {
    Text(text = text, modifier = modifier,  fontSize = 16.sp, color = Color.LightGray)
}

@Composable
fun TextTitleBlack(text: String = "", modifier: Modifier = Modifier) {
    Text(text = text,  modifier = modifier, fontSize = 18.sp, style = TextStyle(fontWeight = FontWeight.Medium, fontFamily = FontFamily.Default))
}


@Preview(showBackground = true)
@Composable
fun PreviewComponents(modifier: Modifier = Modifier) {
    Column() {
        TextHeaderBlack("Header")
        TextTitleBlack("Title")
        TextSubtitleBlack("Subtitle")
        TextSubtitleGrey("Subtitle Grey")
    }
}