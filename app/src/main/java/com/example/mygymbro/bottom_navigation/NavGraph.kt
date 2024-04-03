package com.example.mygymbro.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mygymbro.screens.login.LoginScreen
import com.example.mygymbro.screens.login.RegisterScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "login"){
        composable("login"){
            LoginScreen()
        }
        composable("register"){
            RegisterScreen()
        }
    }
}