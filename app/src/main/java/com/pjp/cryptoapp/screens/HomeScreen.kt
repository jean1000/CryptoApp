package com.pjp.cryptoapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = it)
        ) {
            Header()
        }
    }
}

@Composable
fun Header(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .height(25.dp),
    Arrangement.Center) {
        Text(text = "Crypto App", style = MaterialTheme.typography.h3,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold)

    }
}