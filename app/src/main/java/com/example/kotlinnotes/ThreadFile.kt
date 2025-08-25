package com.example.kotlinnotes

import kotlin.concurrent.thread


fun main(){
    getUserInfoCallback("1"){user, e ->
        user?.let{
            println(user)
        }
        e?.let{
            println("Error: ${it.message}")
        }
    }
    //println(getUserInfo("1"))
}
fun getUserInfo(userId : String) : User{
    Thread.sleep(3000)
    return User(userId, "Prakash")
}

// onComplete is a callback function that takes User? (user info) and Throwable? (exception) as parameters and returns Unit
fun getUserInfoCallback(userId : String, onComplete : (User?, Throwable?) -> Unit){
    thread{
        Thread.sleep(3000)
        try{
            onComplete(User(userId, "Prakash"), null)
        }
        catch (e: Exception){
            onComplete(null, e)
        }
    }
}