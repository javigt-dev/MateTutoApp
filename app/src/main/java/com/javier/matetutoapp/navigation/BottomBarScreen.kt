package com.javier.matetutoapp.navigation

import androidx.annotation.DrawableRes
import com.javier.matetutoapp.R

sealed class BottomBarScreen(
    val route: String,
    val tittle: String,
    @DrawableRes val icon: Int
) {
    object Home: BottomBarScreen(
        route = "Home",
        tittle = "Home",
        icon = R.drawable.ic_baseline_home_24
    )
    object Temas: BottomBarScreen(
        route = "Temas",
        tittle = "Temas",
        icon = R.drawable.lists_icon
    )
    object Logros: BottomBarScreen(
        route = "Logros",
        tittle = "Logros",
        icon = R.drawable.ic_baseline_wine_bar_24
    )
    object Perfil: BottomBarScreen(
        route = "Perfil",
        tittle = "Perfil",
        icon = R.drawable.ic_baseline_account_circle_24
    )
}