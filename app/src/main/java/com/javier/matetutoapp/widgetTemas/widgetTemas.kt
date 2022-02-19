package com.javier.matetutoapp.widgetTemas

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.javier.matetutoapp.data.getTemas
import com.javier.matetutoapp.data.temasData

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun temasRow(
    tema: temasData = getTemas()[0],
    onItemClick: (String) -> Unit
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            //.height(130.dp)
            .clickable {
                onItemClick(tema.tema)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(
                modifier = Modifier
                    .padding(12.dp)
                    .size(100.dp),
                shape = RectangleShape,
                elevation = 0.dp
            ) {
                Image(
                    painter = rememberImagePainter(data = tema.image,
                        builder = {
                            crossfade(true)
                        }),
                    contentDescription = "Movie Poster"
                )
            }
            Column(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Text(text = tema.tema, style = MaterialTheme.typography.h6)

                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text(buildAnnotatedString {

                        }, modifier = Modifier.padding(6.dp))
                        Divider()
                        Text(text = "Rubro 1: ${tema.rubros[0]}", style = MaterialTheme.typography.caption)
                        Text(text = "Rubor 2: ${tema.rubros[1]}", style = MaterialTheme.typography.caption)
                    }
                }
                Icon(
                    imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                    contentDescription = "ArrowDown",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = Color.DarkGray
                )

            }
        }

    }
}