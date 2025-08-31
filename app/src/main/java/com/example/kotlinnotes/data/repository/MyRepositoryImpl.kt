package com.example.kotlinnotes.data.repository

import com.example.kotlinnotes.R
import android.app.Application
import com.example.kotlinnotes.data.remote.MyApi
import com.example.kotlinnotes.domain.repository.MyRepository
import javax.inject.Inject


class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private  val appContext: Application
): MyRepository {

    init{
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is: $appName")
    }
    override suspend fun doNetworkCall() {

    }
}