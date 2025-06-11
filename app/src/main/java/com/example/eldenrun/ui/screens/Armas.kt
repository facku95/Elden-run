package com.example.eldenrun.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.eldenrun.R

import com.example.eldenrun.ui.viewmodels.ScreenArmasViewModel
import kotlinx.coroutines.flow.StateFlow

@Composable
fun ArmasScreen(navController: NavController,
                ) {
    val viewModel: ScreenArmasViewModel = hiltViewModel()
    val state by viewModel.state.collectAsState()

    LazyColumn {
        items(state.data){
            arma -> WeaponCard(
            title = arma.name,
            subtitle = arma.category,
            imagen = arma.image) { }

        }
    }
}

@Composable
fun WeaponCard(
    title: String,
    subtitle: String,
    imagen: String,
    onClick: () -> Unit
){

        Card(
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable { onClick() }
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = title.toString(),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
                AsyncImage(
                    model = imagen,
                    contentDescription = "Mi imagen local con Coil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(200.dp)
                )
            }
        }

}


