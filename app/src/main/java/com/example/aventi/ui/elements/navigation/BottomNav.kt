package com.example.aventi.ui.elements.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.aventi.items

@Composable
fun BottomNav(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = Color.White,
    ) {

        items.forEach {
            BottomNavigationItem(
                icon = {
                    it?.iconResource?.let { resource ->
                        Icon(
                            painter = painterResource(resource),
                            contentDescription = "",
                            modifier = Modifier.size(18.dp),
                        )
                    }
                },
                selected = currentRoute?.hierarchy?.any { it.route == it.route } == true,

                //selectedContentColor = colorResource(R.color.white),
                unselectedContentColor = Color.White.copy(alpha = 0.4f),
                onClick = {
                    it?.route.let { it1 ->
                        it1?.let { it2 ->
                            navController.navigate(it2) {
                                // Pop up to the start destination of the graph to
                                // avoid building up a large stack of destinations
                                // on the back stack as users select items
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination when
                                // reselecting the same item
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }
                        }
                    }
                }
            )
        }
    }
}