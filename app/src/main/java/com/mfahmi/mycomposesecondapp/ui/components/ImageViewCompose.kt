package com.mfahmi.mycomposesecondapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp

@Composable
fun ImageViewCompose(drawableImage: Int, size: Dp, shape: Shape) {
    Image(
        painter = painterResource(id = drawableImage),
        contentDescription = "Profile Picture",
        modifier = Modifier
            .size(size)
            .clip(shape),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center
    )
}