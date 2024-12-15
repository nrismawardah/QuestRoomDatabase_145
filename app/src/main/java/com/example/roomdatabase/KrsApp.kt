package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.dependenciesinjection.ContainerApp
import com.example.roomdatabase.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
    }
}