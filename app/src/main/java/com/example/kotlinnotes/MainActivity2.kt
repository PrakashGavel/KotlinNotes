package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity
    }
}

//// main routine
//fun main(){
//    // This is we called Blocking invocation
//    // subroutine is used to invoke a blocking call
//    first()  // subroutine
//    second()  // subroutine
//}
//
//fun first(){
//    var first = 10
//    while(true){
//        first++
//        println(" first: $first")
//    }
//}
//
//// this will never be reached because first() is a blocking call
//// so second() will never be called, this is the problem with subroutine calls
//// to make both run, we need to use threads or coroutines
//fun second(){
//    var second = 0
//    while(true){
//        second++
//        println(" second: $second")
//    }
//}

// main routine
fun main() : Unit = runBlocking{
    launch { first() }  // coroutine
    launch { second() }  // coroutine
}

suspend fun first(){
    var first = 10
    while(true){
        first++
        println(" first: $first")
        delay(1000)
    }
}

suspend fun second(){
    var second = 0
    while(true){
        second++
        println(" second: $second")
        delay(2000)
    }
}