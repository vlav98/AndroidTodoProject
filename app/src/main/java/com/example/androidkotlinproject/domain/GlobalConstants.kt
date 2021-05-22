package com.example.androidkotlinproject.domain

import android.content.SharedPreferences

object GlobalConstants {
    const val SHARED_PREF_KEY = "SHARED_PREF_KEY"
    private const val FIRST_NAME_KEY = "FIRST_NAME_KEY"
    private const val NAME_KEY = "NAME_KEY"

    var sharedPreferences: SharedPreferences? = null

    fun setFirstName(firstname: String) {
        sharedPreferences?.edit()?.putString(
            FIRST_NAME_KEY, firstname)?.apply()
    }

    fun setName(name: String) {
        sharedPreferences?.edit()?.putString(
            NAME_KEY, name)?.apply()
    }

    fun getFirstName(): String? {
        return sharedPreferences?.getString(
            FIRST_NAME_KEY, null)
    }

    fun getName(): String? {
        return sharedPreferences?.getString(
            NAME_KEY, null)
    }
}