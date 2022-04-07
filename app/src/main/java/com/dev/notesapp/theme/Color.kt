package com.dev.notesapp.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val white = Color(0xFFFFFFFF)
val black = Color(0xFF424242)
val error = Color(0xFFFF5722)
val lightBackground = Color(0xFFF1FBFF)
val darkBackground = Color(0xFF4C4C4D)
val orange = Color(0xFFFF7347)
val blue = Color(0xFF2196F3)
val green = Color(0xFFA9D872)
val pink = Color(0xFFF16C9B)
val lightBlue = Color(0xFF00E5FF)

val LightColors = lightColors(
    primary = white,
    secondary = black,
    background = Color(0xFFF1FBFF),
    onBackground = black,
    error = error,
    onError = white,
    onSurface = black,
)

val DarkColors = darkColors(
    primary = black,
    secondary = white,
    background = Color(0xFF4C4C4D),
    onBackground = white,
    error = error,
    onError = white,
    onSurface = black
)