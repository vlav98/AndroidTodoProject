package com.example.androidkotlinproject.presentation.viewmodel

import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {
    override fun onCleared() {
        super.onCleared()
        // Dispose All your Subscriptions to avoid memory leaks
    }
}