package com.example.eldenrun.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.eldenrun.R
import com.example.eldenrun.ui.viewmodels.MainScreenViewModel

@Composable
fun MainScreen(navController: NavHostController,
                viewModel: MainScreenViewModel
               ) {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = viewModel.armas, fontSize = 25.sp)

        AsyncImage(
            model = R.drawable.hemorragia,
            contentDescription = "Mi imagen local con Coil",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp)
        )

        Button(onClick = { navController.navigate(viewModel.armas) }) {
            Text(text = "Armas")

        }

        Button(onClick = { navController.navigate(viewModel.npc) }) {
            Text(text = "NPCs")
        }
        Spacer(modifier = Modifier.weight(1f))


    }

}