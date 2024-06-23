package com.badal.whatsapp_clone.ui.view.home

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.badal.whatsapp_clone.ui.theme.PrimaryColor


data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

    val items = listOf(
        BottomNavigationItem(
            title = "Update", selectedIcon = Icons.Filled.Info,
            unselectedIcon = Icons.Filled.Info,
            hasNews = false,
        ),
        BottomNavigationItem(
            title = "Calls", selectedIcon = Icons.Filled.Call,
            unselectedIcon = Icons.Filled.Call,
            hasNews = false
        ),
        BottomNavigationItem(
            title = "Communities", selectedIcon = Icons.Filled.Person,
            unselectedIcon = Icons.Filled.Person,
            hasNews = false
        ),
        BottomNavigationItem(
            title = "Chat", selectedIcon = Icons.Filled.Email,
            unselectedIcon = Icons.Default.Email,
            hasNews = false
        ),
        BottomNavigationItem(
            title = "Settings", selectedIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Filled.Settings,
            hasNews = false
        )
    )

    var selectedItemIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("WhatsApp") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PrimaryColor,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                actions = {
                    IconButton(onClick = { /* Do something */ }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Search")
                    }
                }
            )
        }, bottomBar = {
            NavigationBar {
                items.forEachIndexed() { index, item ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = { selectedItemIndex = index },
                        label = {
                            Text(text = item.title, style = TextStyle(fontSize = 10.sp))
                        },
                        icon = {
                            BadgedBox(badge = {
                                if (item.badgeCount != null) {
                                    Text(text = item.badgeCount.toString())
                                } else if (item.hasNews) {
                                    Badge()
                                }
                            }) {
                                Icon(
                                    imageVector = if (index == selectedItemIndex) {
                                        item.selectedIcon
                                    } else
                                        item.unselectedIcon, contentDescription = item.title
                                )
                            }
                        })
                }

            }
        }) {


    }
}