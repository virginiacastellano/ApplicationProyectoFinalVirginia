package com.curso.android.app.practica.applicationproyectofinalvirginia.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.applicationproyectofinalvirginia.data.ComparisonRepository

class ComparisonViewModel : ViewModel() {
    private val repository = ComparisonRepository()

    private val _comparisonResult = MutableLiveData<String>()
    val comparisonResult: LiveData<String>
        get() = _comparisonResult

    fun compareStrings(string1: String, string2: String) {
        val areEqual = repository.compareStrings(string1, string2)
        _comparisonResult.value = if (areEqual) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}
