package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity
    }
}

// Coroutine Context: Collection of a few coroutine elements, that contains the information about our coroutine.
// Coroutine Context: Dispatchers, Job, Coroutine Exception Handler
//fun main() : Unit = runBlocking {
//    // In order to to handle exception in coroutine we will use Coroutine Scoped Coroutine Builder or Supervisor Scoped Coroutine Builder
//    supervisorScope {
//        val dispatchers = Dispatchers.IO
//        //val job = Job()
//        val exceptionHandler = CoroutineExceptionHandler { context, exception ->
//            println(exception.message)
//        }
////        val coroutineContext = dispatchers + job + exceptionHandler
//        val coroutineContext = dispatchers + exceptionHandler
//
//        launch(context = coroutineContext){
//            throw Exception("hghshfsif")
//        }
//    }
//}

// Dispatchers: Used to switch between threads
// 4 types of dispatchers
// 1. Dispatchers.Main -> Main Thread, used for UI operation
// 2. Dispatchers.IO -> Used for network or database operation
// 3. Dispatchers.Default -> Used for CPU intensive task / heavy computation task
// 4. Dispatchers.Unconfined -> Not confined to any specific thread, this also use main thread by default but if we use any suspending function inside this dispatcher then it will switch to background thread and after completing the task it will come back to main thread again.

// if we want to change anything in our user interface then we can only do it by main thread, we can't use and background thread or IO thread for that.
//fun main() : Unit = runBlocking {
//    // By default if we launch or use any coroutine builder then its uses main thread only.
//    launch { println("first, Main Thread ${Thread.currentThread().name}") } // main thread
//    launch(Dispatchers.IO) { println("second, Dispatchers.IO ${Thread.currentThread().name}") } // changing the main thread to IO thread
//    launch(Dispatchers.Default) { println("third, Dispatchers.Default ${Thread.currentThread().name}") }
//    launch(Dispatchers.Unconfined) { println("fourth, Dispatchers.Unconfined, using Main Thread only ${Thread.currentThread().name}")
//        delay(1000)  // delay is a suspending function, so it will switch to background thread from main thread, we can see the output of this in below line after 1 second.
//        println("fourth, now using Background Thread ${Thread.currentThread().name}")
//    }
//
//    // one more way to change the thread is by using withContext() function within a coroutine builder
//    launch {
//        println("fifth, Main Thread ${Thread.currentThread().name}")
//        withContext(Dispatchers.IO) {
//            println("fifth, now in IO Thread ${Thread.currentThread().name}")
//        }
//    }
//
//}

// Job: Job is a coroutine element, which is used to manage the coroutine, it is used to cancel the coroutine, check the status of coroutine like if it is active or completed or cancelled.
fun main() : Unit = runBlocking {
    val job = launch(Dispatchers.IO) {
        for (i in 1..5) {
            println("Coroutine is working: $i")
            delay(500)
        }
    }
    delay(1200)
    job.cancel() // to cancel the coroutine
    println("Coroutine is cancelled: ${job.isCancelled}")
    println("Coroutine is active: ${job.isActive}")
    println("Coroutine is completed: ${job.isCompleted}")

    job.start()  // to start the coroutine again after cancelling it, but it will not work because once a coroutine is cancelled it cannot be started again.
    println("Coroutine is active after start: ${job.isActive}")
    println("Coroutine is completed after start: ${job.isCompleted}")

    job.join() // wait until the coroutine is completed
    println("Coroutine is completed after join: ${job.isCompleted}")

    job.invokeOnCompletion{ // to handle the completion of coroutine
        cause ->
        cause?.let {
            println("Coroutine is cancelled with cause: $it")
        }?:run {
            println("Coroutine is completed successfully")
        }
    }

    // Parent child relationship in job: if we create a coroutine inside another coroutine then the outer coroutine is called parent and the inner coroutine is called child, if we cancel the parent coroutine then all its child coroutines will be cancelled automatically.
    val parentJob = launch {
        val childJob1 = launch {
            for (i in 1..5) {
                println("Child Coroutine 1 is working: $i")
                delay(500)
            }
        }
        delay(1200)
        println("Cancelling Parent Coroutine")
        this.cancel() // cancelling the parent coroutine
        childJob1.join() // wait until the child coroutine is completed
        println("Child Coroutine is completed: ${childJob1.isCompleted}") // child coroutine will be cancelled automatically when parent is cancelled and vice versa
    }

    // Note: parent will never complete until all its child coroutines are completed
    // one more way to create parent child relationship is by using Job() constructor
    val childJob2 = launch(context = parentJob) {
        for (i in 1..5) {
            println("Child Coroutine 2 is working: $i")
            delay(500)
        }
    }

    // supervisor job: if we want to create a parent child relationship but we don't want to cancel all its child coroutines when the parent is cancelled then we can use supervisor job
    val supervisorJob = SupervisorJob()
    val scope = CoroutineScope(supervisorJob + Dispatchers.Default)

    val job4 = scope.launch{
        repeat(4){
            println("Coroutine $it is working in supervisor scope")
            delay(300)
        }
    }

    val job5 = scope.launch{
        repeat(4){
            println("Coroutine 5 is working in supervisor scope")
            delay(300)
            throw Exception("Exception in Coroutine 5") // this exception will not cancel other coroutines in the same scope beacause we are using supervisor job
        }
    }

    val job6 = scope.launch{
        repeat(4){
            println("Coroutine 6 is working in supervisor scope")
            delay(300)
        }
    }

    supervisorJob.invokeOnCompletion{ cause ->
        cause?.let {
            println(it.message)
        }
    }


}