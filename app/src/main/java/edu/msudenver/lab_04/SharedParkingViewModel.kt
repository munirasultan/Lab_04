package edu.msudenver.lab_04

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedParkingViewModel : ViewModel(){

    private val _savedParkingLocation = MutableLiveData<String>()
    val savedParkingLocation: LiveData<String>
        get() = _savedParkingLocation

    fun updateParkingLocation(location: String) {
        _savedParkingLocation.value = location
    }

    fun setParkingLocation(s: String) {

    }
}