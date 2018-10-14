package com.omrobbie.footballapps.utils

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Spinner

fun Spinner.loadFirstText(ctx: Context) {
    val list = mutableListOf<String>()
    list.add("Loading...")

    adapter = ArrayAdapter(ctx, android.R.layout.simple_spinner_dropdown_item, list)
}
