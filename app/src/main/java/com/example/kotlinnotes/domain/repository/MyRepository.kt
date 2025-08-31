package com.example.kotlinnotes.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}