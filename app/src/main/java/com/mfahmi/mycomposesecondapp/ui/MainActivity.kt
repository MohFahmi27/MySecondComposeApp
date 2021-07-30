package com.mfahmi.mycomposesecondapp.ui

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mfahmi.mycomposesecondapp.data.DummyData
import com.mfahmi.mycomposesecondapp.models.Profile
import com.mfahmi.mycomposesecondapp.ui.components.ItemsProfile
import com.mfahmi.mycomposesecondapp.ui.theme.MyComposeSecondAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComposeFunction()
        }
    }
}

@Composable
fun MainComposeFunction() {
    MyComposeSecondAppTheme {
        RecyclerViewComposeMain(profiles = DummyData.profileData)
    }
}

@Composable
fun RecyclerViewComposeMain(profiles: List<Profile>) {
    LazyColumn {
        items(profiles) { profileData ->
            ItemsProfile(profileData)
        }
    }
}

@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DarkMode() {
    MainComposeFunction()
}

//@Preview(name = "Light Mode", showBackground = true)
//@Composable
//fun LightMode() {
//    MainComposeFunction()
//}