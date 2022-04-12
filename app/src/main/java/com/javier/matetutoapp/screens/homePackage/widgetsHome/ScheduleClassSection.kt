package com.javier.matetutoapp.screens.homePackage.widgetsHome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.javier.matetutoapp.R
import com.javier.matetutoapp.ui.theme.ButtonBlue
import com.javier.matetutoapp.ui.theme.LightRed
import com.javier.matetutoapp.ui.theme.TextWhite

@Composable
fun scheduleClass(
    color: Color = LightRed
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ){
        Column {
            Text(
                text = "Agenda tu Clase",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "No pares de prepararte!!",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_event_note_24),
                contentDescription = "Agenda tu cita",
                tint = Color.White,
                modifier = Modifier.size(16.dp)

            )
        }
    }
}