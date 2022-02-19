package com.javier.matetutoapp

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.javier.matetutoapp.navigation.BottomBarScreen
import com.javier.matetutoapp.navigation.BottomNavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavHostController){
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Temas,
        BottomBarScreen.Logros,
        BottomBarScreen.Perfil
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            if (currentDestination != null) {
                AddItem(screen = screen, currentDestination = currentDestination, navController = navController)
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination,
    navController: NavHostController
){
    BottomNavigationItem(
        label = {
            Text(text = screen.tittle)
        },
        icon = {
            Icon(painter = painterResource(id = screen.icon), contentDescription = screen.tittle)
        },
        selected = currentDestination?.hierarchy.any{
            it.route == screen.route
        },
        onClick = {
            navController.navigate(screen.route)
        }
    )
}
