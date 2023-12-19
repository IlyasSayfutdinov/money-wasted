package com.example.moneywasted.bottom_navigation

import com.example.moneywasted.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Добавить", R.drawable.add_icon, "screen_1")
    object Screen2: BottomItem("Детали", R.drawable.chart_icon, "screen_2")
    object Screen3: BottomItem("Вы", R.drawable.person_icon, "screen_3")
}
