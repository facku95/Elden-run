package com.example.eldenrun.data.api

import com.example.eldenrun.domain.models.weapons.ListaArmas
import retrofit2.http.GET

interface EldenRingAPI {

    @GET("weapons?limit=45")
    suspend fun getWeapons(): ListaArmas

    @GET("weapons?limit=50")
    suspend fun get50weapons(): ListaArmas

}