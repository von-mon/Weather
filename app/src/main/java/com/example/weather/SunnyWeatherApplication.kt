package com.example.weather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {

    companion object{
        const val TOKEN = "qAu2MXWUk03vQN2d"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}