package com.example.androidkotlinproject.presentation

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.multidex.MultiDex
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.androidkotlinproject.R
import com.example.androidkotlinproject.domain.GlobalConstants


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var sharedPref: SharedPreferences

    override fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        sharedPref = getSharedPreferences(GlobalConstants.SHARED_PREF_KEY, Context.MODE_PRIVATE)
        val firstNameKey = GlobalConstants.getFirstName()
        val lastNameKey = GlobalConstants.getName()
        if(firstNameKey != null && lastNameKey != null) {
            this.navigateToTodo()
        }
    }

    fun navigateToSignUp(){
        navController.navigate(R.id.action_loginFragment_to_signUpFragment)
    }
    fun navigateToTodo(){
        navController.navigate(R.id.action_loginFragment_to_todoFragment)
    }
}