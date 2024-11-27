package com.example.marvelapp.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarouselViewModel : ViewModel() {
    private val _transitionState = MutableLiveData<Boolean>()
    val transitionState: LiveData<Boolean> get() = _transitionState

    private val handler = Handler(Looper.getMainLooper())
    private val delayMillis: Long = 3000

    private val runnable = object : Runnable {
        override fun run() {
            _transitionState.value = (_transitionState.value != true)
            handler.postDelayed(this, delayMillis)
        }
    }

    init {
        handler.postDelayed(runnable, delayMillis)
    }

    override fun onCleared() {
        super.onCleared()
        handler.removeCallbacks(runnable)
    }
}
