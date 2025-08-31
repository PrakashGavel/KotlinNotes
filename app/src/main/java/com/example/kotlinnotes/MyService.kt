package com.example.kotlinnotes

import dagger.hilt.android.AndroidEntryPoint
import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.kotlinnotes.domain.repository.MyRepository
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
        // You can use the injected repository here
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}