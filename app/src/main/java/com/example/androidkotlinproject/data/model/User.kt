package com.example.androidkotlinproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var fname: String,
    var email: String,
    var password: String?
)