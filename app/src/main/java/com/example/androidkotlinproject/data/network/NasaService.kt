package com.example.androidkotlinproject.data.network

import com.example.androidkotlinproject.data.model.NasaImageOfTheDay
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaService {

    @GET("apod")
    fun getList(@Query("api_key") apiKey : String, @Query("count") count : String): Call<List<NasaImageOfTheDay>>

}