package com.example.firebasetest

import android.app.Application
import com.example.firebasetest.data.AppContainer
import com.example.firebasetest.data.KontakContainer

class KontakApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()

        container = KontakContainer()
    }
}