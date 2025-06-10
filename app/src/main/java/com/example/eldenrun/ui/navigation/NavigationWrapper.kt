package com.example.eldenrun.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eldenrun.ui.screens.ArmasScreen
import com.example.eldenrun.ui.screens.MainScreen
import com.example.eldenrun.ui.screens.screenNpc
import com.example.eldenrun.ui.viewmodels.MainScreenViewModel
import com.example.eldenrun.ui.viewmodels.ScreenArmasViewModel

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Main") {
        composable("Main") {
            MainScreen(navController, viewModel = MainScreenViewModel())
        }
        composable("Armas") {
            val viewmodel: ScreenArmasViewModel = hiltViewModel()
            ArmasScreen(navController, viewModel = viewmodel)
        }
        composable("NPC") {
            screenNpc(navController)
        }
    }
}