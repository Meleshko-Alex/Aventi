package com.example.aventi


val items = listOf(Screen.Home, Screen.Profile, null,  Screen.Compass, Screen.Messages)

sealed class Screen(val route: String, val title: String?, val iconResource: Int?) {
    object Home : Screen("home", "Home", R.drawable.home)

    object Profile : Screen("profile", "Profile", R.drawable.profile)

    object Compass : Screen("compass", "Compass", R.drawable.compass)

    object Messages : Screen("messages", "Messages", R.drawable.message)

    object Add : Screen("add", null, R.drawable.plus)
}