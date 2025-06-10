package com.example.eldenrun.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eldenrun.domain.models.repositories.WeaponsRepository
import com.example.eldenrun.domain.models.weapons.Arma
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenArmasViewModel @Inject constructor(
    private val repo : WeaponsRepository
): ViewModel() {
    private val _state = MutableStateFlow(emptyList<Arma>())
    val state : StateFlow<List<Arma>> get() = _state
    init {
        viewModelScope.launch {
            _state.value = repo.getWeapons().armas
        }
    }

}