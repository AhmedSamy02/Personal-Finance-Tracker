package com.example.financetracker

import android.graphics.drawable.Icon

data class SpinnerItem(val id:Int,val icon: Int,val text:String)
val spinnerItems = listOf<SpinnerItem>(
    SpinnerItem(1, R.drawable.spinner_food, "Food & Drink"),
    SpinnerItem(2, R.drawable.spinner_shopping, "Shopping"),
    SpinnerItem(3, R.drawable.spinner_bills, "Bills"),
    SpinnerItem(4, R.drawable.spinner_health, "Healthcare"),
    SpinnerItem(5, R.drawable.spinner_entertainment, "Entertainment"),
    SpinnerItem(6, R.drawable.spinner_donation, "Donations"),
    SpinnerItem(7, R.drawable.spinner_others, "Others"),
)
