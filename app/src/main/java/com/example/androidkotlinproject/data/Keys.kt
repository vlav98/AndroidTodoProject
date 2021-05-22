package com.example.androidkotlinproject.data

import android.content.SharedPreferences

object Keys {
    const val PREF_FILE_KEY = "PREF_FILE_KEY"
    private const val FIRST_NAME_KEY = "FIRST_NAME_KEY"
    private const val NAME_KEY = "NAME_KEY"

    var sharedPreferences: SharedPreferences? = null

    fun setFname(firstname: String) {
        sharedPreferences?.edit()?.putString(Keys.FIRST_NAME_KEY, firstname)?.apply()
    }

    fun setName(name: String) {
        sharedPreferences?.edit()?.putString(Keys.NAME_KEY, name)?.apply()
    }

    fun getFname(): String? {
        return sharedPreferences?.getString(Keys.FIRST_NAME_KEY, null)
    }

    fun getName(): String? {
        return sharedPreferences?.getString(Keys.NAME_KEY, null)
    }
}