package com.example.aventi

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String?, val title: String?, val icon: ImageVector)  {
    object Home: Screen("home", "Home", Icons.Default.Home)
    object Profile: Screen("profile", "Profile", Icons.Default.Person)
    object Compass: Screen("compass", "Compass", Icons.Default.PlayArrow)
    object Messages: Screen("messages", "Messages", Icons.Default.Email)
    object Add: Screen("add", "Add", Icons.Default.Add)
}