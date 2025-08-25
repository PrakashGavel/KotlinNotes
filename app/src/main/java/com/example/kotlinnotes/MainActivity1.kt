package com.example.kotlinnotes

import androidx.activity.ComponentActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity1 : ComponentActivity() {

}

//fun main(){
//
//    // without threads
////    takeOrder("Customer 1")
////    cookFood("Customer 1")
////    deliverFood("Customer 1")
////
////    takeOrder("Customer 2")
////    cookFood("Customer 2")
////    deliverFood("Customer 2")
//
//    // using threads: concurrent execution of tasks, but thread uses more memory and CPU usage
//    Thread{
//        takeOrder("Customer 1")
//        cookFood("Customer 1")
//        deliverFood("Customer 1")
//    }.start()
//
//    Thread{
//        takeOrder("Customer 2")
//        cookFood("Customer 2")
//        deliverFood("Customer 2")
//    }.start()
//}

//fun takeOrder(customerName: String) {
//    println("Taking order from $customerName")
//}
//
//fun cookFood(customerName: String) {
//    println("Cooking food for $customerName")
//    Thread.sleep(4000)
//}
//
//fun deliverFood(customerName: String) {
//    println("Delivering food to $customerName")
//}

// using coroutines: light weight threads, uses less memory and CPU usage
fun main() : Unit = runBlocking(){
    launch {
        takeOrder("Customer 1")
        cookFood("Customer 1")
        deliverFood("Customer 1")
    }
    launch {
        takeOrder("Customer 2")
        cookFood("Customer 2")
        deliverFood("Customer 2")
    }
}
// we use suspend keyword in coroutine functions to tell compiler that this function can be paused and resumed later
// suspend functions can only be called from other suspend functions or from a coroutine
suspend fun takeOrder(customerName: String) {
    println("Taking order from $customerName")
}

suspend fun cookFood(customerName: String) {
    println("Cooking food for $customerName")
    delay(4000)
}

suspend fun deliverFood(customerName: String) {
    println("Delivering food to $customerName")
}