package com.example.kotlinnotes

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main(){
    runBlocking {
        getUserInfoTwo("4")
    }
}
suspend fun getUserInfoTwo(userId : String) : User{
    delay(3000)
    return User(userId, "Prakash")
}