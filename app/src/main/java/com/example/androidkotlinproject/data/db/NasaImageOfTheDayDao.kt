package com.example.androidkotlinproject.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.androidkotlinproject.data.model.NasaImageOfTheDay

@Dao
interface NasaImageOfTheDayDao {
    @Query("SELECT * FROM nasaImageOfTheDay")
    fun getAll(): List<NasaImageOfTheDay>

    @Insert
    fun insertAll(vararg image: NasaImageOfTheDay)

    @Delete
    fun delete(image: NasaImageOfTheDay)
}