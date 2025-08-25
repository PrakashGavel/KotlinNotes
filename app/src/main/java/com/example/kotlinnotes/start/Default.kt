package com.example.kotlinnotes.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() : Unit = runBlocking{
    //    DEFAULT, LAZY, ATOMIC, UNDISPATCHED
//    The summary of coroutine start options is:
//    DEFAULT -- immediately schedules coroutine for execution according to its context;
//    LAZY -- starts coroutine lazily, only when it is needed;
//    ATOMIC -- atomically (in a non-cancellable way) schedules coroutine for execution according to its context;
//    UNDISPATCHED -- immediately executes coroutine until its first suspension point in the current thread.

    //    launch(start = CoroutineStart.DEFAULT) {
//        println("first")
//        delay(5000)
//        println("end")
//    }

//    val job = launch(start = CoroutineStart.LAZY) {
//        println("first")
//        delay(5000)
//        println("end")
//    }
//    job.start()

    launch(start = CoroutineStart.ATOMIC) {
        println("first")
        delay(5000)
        println("end")
    }
}