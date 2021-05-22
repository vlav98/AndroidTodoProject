package com.example.androidkotlinproject.presentation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.androidkotlinproject.R
import com.example.androidkotlinproject.data.Keys
import com.example.androidkotlinproject.data.model.User
import com.example.androidkotlinproject.data.network.NetworkUtils
import com.example.androidkotlinproject.data.network.ServiceBuilder
import com.example.androidkotlinproject.data.network.UserService
import com.example.androidkotlinproject.presentation.views.LoginFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        sharedPref = getSharedPreferences(Keys.PREF_FILE_KEY, Context.MODE_PRIVATE)
        val firstNameKey = Keys.getFname()
        val lastNameKey = Keys.getName()
        if(firstNameKey != null && lastNameKey != null) {
            this.navigateToTodo()
        }
    }

    fun navigateToLogin(){
        navController.navigate(R.id.action_signUpFragment_to_loginFragment)
    }
    fun navigateToSignUp(){
        navController.navigate(R.id.action_loginFragment_to_signUpFragment)
    }
    fun navigateToTodo(){
        navController.navigate(R.id.action_loginFragment_to_todoFragment)
    }
}