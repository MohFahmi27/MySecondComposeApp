package com.mfahmi.mycomposesecondapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mfahmi.mycomposesecondapp.R
import com.mfahmi.mycomposesecondapp.models.Profile
import com.mfahmi.mycomposesecondapp.ui.theme.dimenSmall
import com.mfahmi.mycomposesecondapp.ui.theme.dimenStandard
import com.mfahmi.mycomposesecondapp.ui.theme.dimenSuperSmall

@Composable
fun ItemsProfile(profile: Profile) {
    Card(
        elevation = dimenSuperSmall,
        modifier = Modifier
            .padding(horizontal = dimenSmall, vertical = dimenSmall)
            .clip(RoundedCornerShape(dimenStandard))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimenSmall),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            StarIconShape()
            MarginCompose(size = dimenSuperSmall)
            ImageViewCompose(
                drawableImage = R.drawable.profile_picture,
                90.dp,
                RoundedCornerShape(10.dp)
            )
            MarginCompose(size = dimenSmall)
            Column {
                TextViewCompose(profile.name, MaterialTheme.colors.onSurface, TextAlign.Left, 17.sp)
                TextViewCompose(
                    profile.email,
                    textColor = Color.Gray,
                    textSize = 12.sp
                )
            }
        }
    }
}