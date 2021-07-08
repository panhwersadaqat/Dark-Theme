package com.example.darkandlight

import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var lightIcon: ImageView
    lateinit var darkIcon: ImageView
    lateinit var defaultBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lightIcon = findViewById(R.id.icon_light)
        darkIcon = findViewById(R.id.dark_icon)
        defaultBtn = findViewById(R.id.default_btn)

        lightIcon.setOnClickListener {
            ThemeHelper.applyTheme("light",application)

        }

        darkIcon.setOnClickListener {
            ThemeHelper.applyTheme("dark",application)
        }

        defaultBtn.setOnClickListener {
            ThemeHelper.applyTheme("default",application)
        }
    }
}