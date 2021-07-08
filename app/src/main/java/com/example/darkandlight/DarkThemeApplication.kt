package com.example.darkandlight

import android.app.Application
import android.content.Context

class DarkThemeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val themePref = getStr(this, "themePref")
        ThemeHelper.applyTheme(themePref!!, this)
    }

    fun getStr(context: Context, key: String?): String? {
        val prefs = context.getSharedPreferences("themePref", 0)
        return prefs.getString(key, "")
    }
}