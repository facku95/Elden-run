package com.example.eldenrun.domain.models.weapons

data class ListaArmas(
    val count: Int =0,
    val data: List<Arma> = emptyList(),
    val success: Boolean = false,
    var total: Int = 0
)