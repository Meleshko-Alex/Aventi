package com.example.aventi.ui.elements.navigation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.aventi.Screen

@Composable
fun MainScreenNavigation(navController: NavHostController, paddingValues: PaddingValues) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        Modifier.padding(paddingValues)
    ) {

        composable(Screen.Home.route) {
            //TODO HomeScreen()
        }
        composable(Screen.Profile.route) {
            //TODO ProfileScreen()
        }
        composable(Screen.Compass.route) {
            //TODO CompassScreen()
        }
        composable(Screen.Messages.route) {
            //TODO MessagesScreen()
        }
        composable(Screen.Add.route) {
            //TODO AddScreen()
        }
    }
}