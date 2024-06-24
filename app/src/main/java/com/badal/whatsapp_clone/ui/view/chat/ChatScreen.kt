package com.badal.whatsapp_clone.ui.view.chat

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(text = "Chats", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
//        SearchBar(
//            query = "",
//            onQueryChange = {},
//            onSearch = {},
//            placeholder = {
//                Text(text = "Search")
//            },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    tint = MaterialTheme.colorScheme.onSurface,
//                    contentDescription = null
//                )
//            },
//            trailingIcon = {},
//            content = {},
//            active = true,
//            onActiveChange = {},
//            tonalElevation = 0.dp,
//        )

    }
}