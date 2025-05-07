package com.example.eldenrun.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.eldenrun.ui.viewmodels.ScreenArmasViewModel

@Composable
fun ArmasScreen(navController: NavController,
                viewModel: ScreenArmasViewModel
                ) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Armas Screen", fontSize = 25.sp)

        Button(onClick = { navController.navigate(viewModel.menu){
            //evitar apilamiento de vistas
            launchSingleTop = true
            popUpTo(viewModel.menu) {
                inclusive = false
            }

        }


        }) {
            Text(text= "Menú")
        }
        Spacer(modifier = Modifier.weight(1f))

    }

}


