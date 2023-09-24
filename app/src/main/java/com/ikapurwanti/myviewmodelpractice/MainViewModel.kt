package com.ikapurwanti.myviewmodelpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// TODO 1 : Buat sebuah class viewModel dengan function lengkap
class MainViewModel : ViewModel() {
    val vCounter: MutableLiveData<Int> = MutableLiveData(0)

    fun incrementCount() {
        vCounter.postValue(vCounter.value?.plus(1))
    }

    fun decrermentCount() {
        vCounter.value?.let {
            if (it > 0) {
                vCounter.postValue(vCounter.value?.minus(1))
            }
        }
    }
}