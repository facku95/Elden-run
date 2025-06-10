package com.example.eldenrun.domain.models.weapons

data class ListaArmas(
    val count: Int,
    val armas: List<Arma>,
    val success: Boolean,
    val total: Int
)