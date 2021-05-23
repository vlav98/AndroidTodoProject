package com.example.androidkotlinproject.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidkotlinproject.data.model.Todo

@Database(
    entities = [Todo::class],
    version = 1,
    exportSchema = false
)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}