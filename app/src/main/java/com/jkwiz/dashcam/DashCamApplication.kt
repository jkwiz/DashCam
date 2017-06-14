package com.jkwiz.dashcam

import android.app.Application

class DashCamApplication : Application() {
    companion object {
        lateinit var instance: DashCamApplication private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}