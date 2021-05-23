package com.example.androidkotlinproject.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.androidkotlinproject.data.model.Todo


@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAll(): List<Todo>

    @Insert
    fun insertAll(vararg Todo: Todo)

    @Delete
    fun delete(Todo: Array<out Todo>)
}