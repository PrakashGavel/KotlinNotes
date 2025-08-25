package Kotlin_Essentials_and_Testing

//In Kotlin, object creates a singleton (only one instance exists).
//
//Used when you don’t want multiple instances.

object Logger {
    fun log(message: String) = println("LOG: $message")
}

fun main() {
    Logger.log("App started!") // Singleton call
}


// 👉 In Compose, you rarely need object for singletons, but you may use them for repositories, managers, or event handlers.