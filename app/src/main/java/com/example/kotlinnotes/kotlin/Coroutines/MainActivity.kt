package Coroutines
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
}

fun main(){

    takeOrder("Customer 1")
    cookFood("Customer 1")
    deliverFood("Customer 1")

    takeOrder("Customer 2")
    cookFood("Customer 2")
    deliverFood("Customer 2")
}

fun takeOrder(customerName: String) {
    println("Taking order from $customerName")
}

fun cookFood(customerName: String) {
    println("Cooking food for $customerName")
    Thread.sleep(4000)
}

fun deliverFood(customerName: String) {
    println("Delivering food to $customerName")
}