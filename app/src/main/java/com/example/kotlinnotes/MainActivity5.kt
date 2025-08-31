package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.cancel
import kotlinx.coroutines.withContext

// commented out to avoid unused warning, because we are using the class with same name in Dagger-Hilt concept.
//class MyViewModel : ViewModel(){
//    init{
//        // ViewModel Scope: It is used to launch coroutines that are tied to the lifecycle of a ViewModel. It is used for tasks that need to survive configuration changes.
//        viewModelScope.launch {
//            delay(1000)
//            println("Task in ViewModelScope completed")
//        }
//    }
//}

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity

        // lifecycle Scope: It is used to launch coroutines that are tied to the lifecycle of an Activity or Fragment. It is used for tasks that need to be cancelled when the Activity or Fragment is destroyed.
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                delay(500)
                println("Task in LifecycleScope completed")
            }
        }
    }

    // Main Scope: It is used to launch coroutines that run on the main thread. It is used for UI related tasks.
    override fun onDestroy() {
        super.onDestroy()
        // Cancel all coroutines launched in the main scope
        cancel()
    }
}

// Coroutine Scope: It manages the lifecycle of coroutines, all the coroutines launching (created) in a scope will be cancelled when the scope is cancelled..
// 4 types: Global Scope, Main Scope, Lifecycle Scope, ViewModel Scope

fun main(): Unit = runBlocking {
    // Global Scope: It is used to launch top-level coroutines which are operating on the whole application lifetime. This is not recommended to use it in android as it may cause memory leaks.
    GlobalScope.launch {
        delay(200)
        println("This is a task from GlobalScope")
    }
    Thread.sleep(1000)

    // custom coroutine scope
    val job = Job()
    val scope = CoroutineScope(job + Dispatchers.Main)

    scope.launch {
        delay(300)
        println("Task in custom CoroutineScope executed")
    }
    // perform operations

    delay(500) // wait to see coroutine output
    scope.cancel()
    println("Custom scope canceled")
}
