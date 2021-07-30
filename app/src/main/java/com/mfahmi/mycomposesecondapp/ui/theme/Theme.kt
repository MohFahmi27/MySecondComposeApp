package com.mfahmi.mycomposesecondapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = PrimaryDark,
    primaryVariant = variantDarkColor,
    secondary = SecondaryColor,
    surface = SurfaceDarkColor,
    onSurface = Color.White,
    onSecondary = Color.White
)

private val LightColorPalette = lightColors(
    primary = PrimaryLight,
    primaryVariant = variantLightColor,
    secondary = SecondaryColor,
    surface = SurfaceLightColor,
    onSurface = Color.Black,
    onSecondary = Color.Black

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MyComposeSecondAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}