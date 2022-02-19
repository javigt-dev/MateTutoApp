package com.javier.matetutoapp.data

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import coil.compose.ImagePainter
import coil.request.ImageRequest
import com.javier.matetutoapp.R

data class temasData(
    val tema: String,
    val grado: String,
    val rubros: List<String>,
   val image: Int
)
@Composable
fun getTemas(): List<temasData>{
    return listOf(
        temasData(
            tema = "Numeros",
            grado = "General",
            rubros = listOf(
                "Sistemas de Numeros",
                "Operaciones Basicas"
            ),
            R.drawable.numeros
        ),

        temasData(
            tema = "Medidas",
            grado = "General",
            rubros = listOf(
                "Sistemas de Medicion",
                "Conversiones"
            ),
            image = R.drawable.medidas
        ),
        temasData(
            tema = "Geometria",
            grado = "General",
            rubros = listOf(
                "Teoremas",
                "Figuras Geometricas",
                "Visualizacion Espacial"
            ),
            image = R.drawable.geometria
        ),
        temasData(
            tema = "Relaciones y Algebra",
            grado = "General",
            rubros = listOf(
                "Relaciones entre variables",
                "Algebra",
                "Funciones"
            ),
            image = R.drawable.algebra
        ),
        temasData(
            tema = "Probabilidad y Estadistica",
            grado = "General",
            rubros = listOf(
                "Estadistica",
                "Probabilidad"
            ),
            image = R.drawable.estadistica
        ),

    )
}