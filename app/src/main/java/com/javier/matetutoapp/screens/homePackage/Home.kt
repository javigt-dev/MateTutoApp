package com.javier.matetutoapp.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.javier.matetutoapp.screens.homePackage.Feature
import com.javier.matetutoapp.screens.homePackage.widgetsHome.Favorites
import com.javier.matetutoapp.screens.homePackage.widgetsHome.GreetingSection
import com.javier.matetutoapp.screens.homePackage.widgetsHome.TemasPrincipales
import com.javier.matetutoapp.screens.homePackage.widgetsHome.scheduleClass
import com.javier.matetutoapp.ui.theme.*


@ExperimentalFoundationApi
@Composable
fun homeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            Favorites(favorites = listOf("Factorizacion", "Geometria", "Form. Notables"))
            scheduleClass()
            TemasPrincipales(
                features = listOf(
                    Feature(
                        title = "Geometria",
                        com.javier.matetutoapp.R.drawable.ic_baseline_subject_24,
                        BleuViolet1,
                        BleuViolet2,
                        BleuViolet3
                    ),
                    Feature(
                        title = "Algebra",
                        com.javier.matetutoapp.R.drawable.ic_baseline_subject_24,
                        LigthGreen1,
                        LigthGreen2,
                        LigthGreen3
                    ),
                    Feature(
                        title = "From. Notables",
                        com.javier.matetutoapp.R.drawable.ic_baseline_subject_24,
                        Beige1,
                        Beige2,
                        Beige3
                    ),
                    Feature(
                        title = "Trigonometria",
                        com.javier.matetutoapp.R.drawable.ic_baseline_subject_24,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    )
                )
            )
        }
    }
}








