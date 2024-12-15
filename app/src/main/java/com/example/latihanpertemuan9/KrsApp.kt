package com.example.latihanpertemuan9

import android.app.Application
import com.example.latihanpertemuan9.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    //fungsinya untuk menympan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
    }
}