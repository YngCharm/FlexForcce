package com.example.mygymbro.bottom_navigation

import com.example.mygymbro.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Login: BottomItem("Логин", R.drawable.icon_login, "login" )
    object Register: BottomItem("Регистрация", R.drawable.icon_register, "register")
}