package com.example.aventi

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String?, val title: String?, val icon: ImageVector)  {
    class Home(): Screen("home", "Home", Icons.Default.Home)
    class Profile(): Screen("profile", "Profile", Icons.Default.Person)
    class Compass(): Screen("compass", "Compass", Icons.Default.PlayArrow)
    class Messages(): Screen("messages", "Messages", Icons.Default.Email)
}