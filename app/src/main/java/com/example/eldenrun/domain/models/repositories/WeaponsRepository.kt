package com.example.eldenrun.domain.models.repositories

import com.example.eldenrun.data.api.EldenRingAPI
import com.example.eldenrun.domain.models.weapons.ListaArmas
import javax.inject.Inject

class WeaponsRepository @Inject constructor(
    private val EldenRingApi: EldenRingAPI
) {
    suspend fun getWeapons(): ListaArmas{
        return EldenRingApi.getWeapons()
    }
}