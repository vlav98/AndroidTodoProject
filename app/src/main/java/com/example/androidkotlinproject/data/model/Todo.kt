package com.example.androidkotlinproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo (
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    var checked : Boolean,
    var description : String?
)