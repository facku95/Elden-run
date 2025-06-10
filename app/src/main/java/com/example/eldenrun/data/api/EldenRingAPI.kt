package com.example.eldenrun.data.api

import com.example.eldenrun.domain.models.weapons.ListaArmas
import retrofit2.http.GET

interface EldenRingAPI {
    @GET("weapons")
    suspend fun getWeapons(): ListaArmas
}