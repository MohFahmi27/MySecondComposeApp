package com.mfahmi.mycomposesecondapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.mfahmi.mycomposesecondapp.ui.theme.dimenLarge
import com.mfahmi.mycomposesecondapp.ui.theme.dimenSuperLarge
import com.mfahmi.mycomposesecondapp.ui.theme.transparentColor

@Composable
fun StarIconShape() {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .wrapContentSize(Alignment.Center)
            .clip(
                RoundedCornerShape(dimenSuperLarge)
            )
    ) {
        Box(
            modifier = Modifier
                .size(width = 9.dp, height = 90.dp)
                .clip(shape = RoundedCornerShape(dimenLarge))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            MaterialTheme.colors.secondary,
                            transparentColor
                        )
                    )
                )
        )
    }
}