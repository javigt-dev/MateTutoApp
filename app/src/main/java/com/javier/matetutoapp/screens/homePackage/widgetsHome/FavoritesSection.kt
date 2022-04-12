package com.javier.matetutoapp.screens.homePackage.widgetsHome

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.javier.matetutoapp.ui.theme.ButtonBlue
import com.javier.matetutoapp.ui.theme.DarkButtonBlue
import com.javier.matetutoapp.ui.theme.TextWhite

@Composable
fun Favorites(
    favorites: List<String>
){
    var selectedFavoriteIndex by remember{
        mutableStateOf(0)
    }
    LazyRow{
        items(favorites.size){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedFavoriteIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedFavoriteIndex == it) ButtonBlue
                        else DarkButtonBlue
                    )
                    .padding(15.dp)
            ){
                Text(text = favorites[it], color = TextWhite)
            }
        }
    }
}