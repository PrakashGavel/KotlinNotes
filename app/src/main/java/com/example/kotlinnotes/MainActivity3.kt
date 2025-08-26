package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

class MainActivity3 : ComponentActivity() {
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
            //a.	Coroutine Scoped Coroutine Builder
            //b.	Supervisor Scoped Coroutine Builder

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
//fun main() : Unit = runBlocking {
//    println("Start")
//    // async: creates a new coroutine and returns a reference to the coroutine as a Deferred,
//    val first = async { getUserInfo("first", 4000) }
//    val second = async { getUserInfo("second", 2000) }
////    println("First: ${first.await()}")
//    delay(5000)  // greater than 4000
//    println("First: ${first.getCompleted()}")
//    println("Second: ${second.await()}")
//    println("End")
//}
//
//suspend fun getUserInfo(userId : String, delay : Long) : String{
//    delay(delay)
//    return userId
//}

// Coroutine Scoped Coroutine Builder and Supervisor Scoped Coroutine Builder
fun main() : Unit = runBlocking {
    coroutineScope {
        launch {
            println("coroutine scope: First")
        }
        // here if we throw exception in one of the child coroutine, all the other coroutines will be cancelled.
//        launch {
//            throw Exception("cbhdbvjh")
//        }
        launch {
            println("coroutine scope: Second")
        }
    }

    supervisorScope {
        launch {
            println("supervisor scope: First")
        }
        // here if we throw exception in one of the child coroutine, all the other coroutines will NOT be cancelled and will continue to execute.
        launch {
            throw Exception("cbhdbvjh")
        }
        launch {
            println("supervisor scope: Second")
        }
    }
}