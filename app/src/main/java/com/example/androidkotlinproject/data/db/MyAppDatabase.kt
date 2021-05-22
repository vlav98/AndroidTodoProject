package com.example.androidkotlinproject.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidkotlinproject.data.db.NasaImageOfTheDayDao
import com.example.androidkotlinproject.data.model.NasaImageOfTheDay

@Database(entities = arrayOf(NasaImageOfTheDay::class), version = 1)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun nasaImageOfTheDayDao(): NasaImageOfTheDayDao
}