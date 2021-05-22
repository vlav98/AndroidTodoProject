package com.example.androidkotlinproject.data.network

import com.example.androidkotlinproject.data.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("/login")
    fun getUser(
        @Query("email") email: String,
        @Query("password") password: String
    ): Call<User>


}