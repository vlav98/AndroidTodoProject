package com.example.androidkotlinproject.data.network

import android.util.Log
import com.example.androidkotlinproject.data.Keys
import com.example.androidkotlinproject.data.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("/login")
    fun getUser(
        @Query("email") email: String,
        @Query("password") password: String
    ): Call<User>


}