package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity
    }
}
//Coroutine Builders: two types,
    //1.	Standalone: three types,
            //a.	Runblocking
            //b.	Launch
            //c.	Async await
    //2.	Scoped

// Runblocking
//fun main(){
//    println("Start")
//    // runBlocking: creates a coroutine that blocks the current thread until its completion.
//    runBlocking {
//        val first = getUserInfo("first", 1000)
//        println("First: $first")
//        val second = getUserInfo("second", 2000)
//        println("Second: $second")
//    }
//    println("End")
//}

// Launch
//fun main() : Unit = runBlocking {
//    println("Start")
//    // launch: creates a new coroutine without blocking the current thread and returns a reference to the coroutine as a Job, it uses fire and forget approach.
//        launch {
//            val first = getUserInfo("first", 1000)
//            println("First: $first")
//        }
//        launch {
//            val second = getUserInfo("second", 2000)
//            println("Second: $second")
//        }
//    println("End")
//}

// Async Await
fun main() : Unit = runBlocking {
    println("Start")
    // async: creates a new coroutine and returns a reference to the coroutine as a Deferred,
    val first = async { getUserInfo("first", 4000) }
    val second = async { getUserInfo("second", 2000) }
//    println("First: ${first.await()}")
    delay(5000)  // greater than 4000
    println("First: ${first.getCompleted()}")
    println("Second: ${second.await()}")
    println("End")
}

suspend fun getUserInfo(userId : String, delay : Long) : String{
    delay(delay)
    return userId
}