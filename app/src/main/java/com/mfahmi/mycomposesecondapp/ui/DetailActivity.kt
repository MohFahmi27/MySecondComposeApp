package com.mfahmi.mycomposesecondapp.ui

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mfahmi.mycomposesecondapp.R
import com.mfahmi.mycomposesecondapp.data.DummyData
import com.mfahmi.mycomposesecondapp.models.Profile
import com.mfahmi.mycomposesecondapp.ui.components.ImageViewCompose
import com.mfahmi.mycomposesecondapp.ui.components.MarginCompose
import com.mfahmi.mycomposesecondapp.ui.components.StarIconShape
import com.mfahmi.mycomposesecondapp.ui.components.TextViewCompose
import com.mfahmi.mycomposesecondapp.ui.theme.MyComposeSecondAppTheme
import com.mfahmi.mycomposesecondapp.ui.theme.dimenSmall
import com.mfahmi.mycomposesecondapp.ui.theme.dimenStandard
import com.mfahmi.mycomposesecondapp.ui.theme.dimenSuperSmall

class DetailActivity : AppCompatActivity() {

    private val profileDetail by lazy { intent.getSerializableExtra(PROFILE_EXTRA) as Profile }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailComposeMainFunction(profileDetail)
        }
    }

    companion object {
        private const val PROFILE_EXTRA = "profile_extra"
        fun intentToDetail(context: Context, profile: Profile): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(
                    PROFILE_EXTRA,
                    profile
                )
            }
        }
    }
}

@Composable
fun DetailComposeMainFunction(profile: Profile) {
    MyComposeSecondAppTheme {
        CardDetailProfile(profile = profile)
    }
}

@Composable
fun CardDetailProfile(profile: Profile) {
    Column {
        Card(
            elevation = dimenSuperSmall,
            modifier = Modifier
                .padding(horizontal = dimenSmall, vertical = dimenSmall)
                .padding(dimenSmall, dimenSuperSmall)
                .clip(RoundedCornerShape(dimenStandard))
                .fillMaxWidth()
        )
        {
            Column {
                Row(
                    Modifier
                        .padding(dimenStandard),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ImageViewCompose(
                        drawableImage = R.drawable.profile_picture,
                        size = 120.dp,
                        shape = RoundedCornerShape(
                            dimenSmall
                        ),
                    )
                    MarginCompose(size = dimenSmall)
                    StarIconShape()
                    MarginCompose(size = dimenSmall)
                    Column {
                        TextViewCompose(
                            tvTextValue = profile.name,
                            textColor = MaterialTheme.colors.onSurface,
                            textSize = 20.sp,
                        )
                        MarginCompose(size = dimenSuperSmall)
                        TextViewCompose(
                            tvTextValue = profile.email,
                            textColor = MaterialTheme.colors.onSurface,
                            textSize = 12.sp
                        )
                    }
                }
                ButtonCompose()
            }
        }
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Nullam nec tortor in augue pellentesque porttitor sit amet non est. " +
                    "Orci varius natoque penatibus et magnis dis parturient montes, " +
                    "nascetur ridiculus mus. Morbi ut feugiat risus. " +
                    "Mauris ut tortor molestie, molestie dolor eu, hendrerit odio. Nullam eu maximus odio.",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(dimenStandard),
            textAlign = TextAlign.Justify
        )

    }
}

@Composable
fun ButtonCompose() {
    Row(
        Modifier
            .padding(dimenStandard)
            .fillMaxWidth(), horizontalArrangement = Arrangement.Center
    ) {
        ButtonDefaultCompose(buttonText = "Edit Profile")
        MarginCompose(size = dimenSmall)
        ButtonDefaultCompose(buttonText = "Log Out")
    }
}

@Composable
fun ButtonDefaultCompose(buttonText: String) {
    Button(
        onClick = { },
        shape = RoundedCornerShape(dimenSmall),
        border = BorderStroke(2.dp, MaterialTheme.colors.secondary),
        modifier = Modifier.size(160.dp, 55.dp)
    ) {
        TextViewCompose(
            tvTextValue = buttonText,
            textColor = MaterialTheme.colors.onSurface,
            alignment = TextAlign.Center,
            textSize = 15.sp
        )
    }
}

@Preview(name = "Detail Activity", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DetailPreview() {
    DetailComposeMainFunction(DummyData.profileData[0])
}