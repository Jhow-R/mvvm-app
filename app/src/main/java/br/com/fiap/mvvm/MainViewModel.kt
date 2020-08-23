package br.com.fiap.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
   private val numberLiveData = MutableLiveData<Int>()

    fun getLiveData(): LiveData<Int> = numberLiveData

    fun generateNumber(){
        val number = (1..100).random()
        numberLiveData.value = number

    }
}