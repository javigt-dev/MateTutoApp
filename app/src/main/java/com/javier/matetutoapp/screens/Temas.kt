package com.javier.matetutoapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.javier.matetutoapp.data.getTemas
import com.javier.matetutoapp.data.temasData
import com.javier.matetutoapp.widgetTemas.temasRow

@Composable
fun temasScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.LightGray,
                elevation = 5.dp
            ) {
                Text(text = "Temas")
            }
        },
    ) {
        MainContent(navController = navController)
    }
}

@Composable
fun MainContent(
    navController: NavController,
    temas: List<temasData> = getTemas()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn{
            items(items = temas){
                temasRow(tema = it){tema ->
                    navController.navigate(route = "")
                }
            }
        }
    }
}