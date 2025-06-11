package com.example.eldenrun.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eldenrun.domain.models.repositories.WeaponsRepository
import com.example.eldenrun.domain.models.weapons.Arma
import com.example.eldenrun.domain.models.weapons.ListaArmas
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenArmasViewModel @Inject constructor(
    private val repo : WeaponsRepository
): ViewModel() {
    private val _state = MutableStateFlow(ListaArmas())
    val state : StateFlow<ListaArmas> get() = _state


    init {
        viewModelScope.launch {
            val result = repo.getWeapons()

            _state.value = _state.value.copy(
                count = result.count,
                success = result.success,
                total = result.total,
                data = result.data
            )


        }
    }

}


























