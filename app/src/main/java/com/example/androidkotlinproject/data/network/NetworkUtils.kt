package com.example.androidkotlinproject.data.network

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

object NetworkUtils {
    fun error(context: AppCompatActivity, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}