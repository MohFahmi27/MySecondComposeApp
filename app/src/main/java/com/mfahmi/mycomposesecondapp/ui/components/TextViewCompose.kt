package com.mfahmi.mycomposesecondapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextViewCompose(
    tvTextValue: String,
    textColor: Color = MaterialTheme.colors.onPrimary,
    alignment: TextAlign = TextAlign.Left,
    textSize: TextUnit = 17.sp
) {
    Text(text = tvTextValue, color = textColor, textAlign = alignment, fontSize = textSize, modifier = Modifier.fillMaxWidth())
}
