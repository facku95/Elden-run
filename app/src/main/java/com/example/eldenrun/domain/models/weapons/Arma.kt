package com.example.eldenrun.domain.models.weapons

data class Arma(
    val attack: List<Attack>,
    val category: String,
    val defence: List<Defence>,
    val description: String,
    val id: String,
    val image: String,
    val name: String,
    val requiredAttributes: List<RequiredAttribute>,
    val scalesWith: List<ScalesWith>,
    val weight: Double
)