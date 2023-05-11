package com.example.aventi.models

data class Adventure(
    val isPrivate: Boolean,
    val date: String,
    val distance: Int,
    val participant: List<User>
) {
}