package com.example.darkandlight

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate

object ThemeHelper {
    const val LIGHT_MODE = "light"
    const val DARK_MODE = "dark"
    const val DEFAULT_MODE = "default"
    @SuppressLint("CommitPrefEdits")
    fun applyTheme(themePref: String, context: Context) {
        context.getSharedPreferences("themePref", Context.MODE_PRIVATE).edit().putString("themePref", themePref).apply()
        when (themePref) {
            LIGHT_MODE -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            DARK_MODE -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)
                }
            }
        }
    }
}