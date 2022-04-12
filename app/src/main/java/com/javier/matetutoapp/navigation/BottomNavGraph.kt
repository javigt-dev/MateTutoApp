package com.javier.matetutoapp.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.javier.matetutoapp.screens.homeScreen
import com.javier.matetutoapp.screens.logrosScreen
import com.javier.matetutoapp.screens.perfilScreen
import com.javier.matetutoapp.screens.temasScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            homeScreen()
        }
        composable(route = BottomBarScreen.Temas.route){
            temasScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Logros.route){
            logrosScreen()
        }
        composable(route = BottomBarScreen.Perfil.route){
            perfilScreen()
        }
    }
}