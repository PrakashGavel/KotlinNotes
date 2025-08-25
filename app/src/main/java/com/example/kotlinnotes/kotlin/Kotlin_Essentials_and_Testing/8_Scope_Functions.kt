package Kotlin_Essentials_and_Testing

//Kotlin provides scope functions to work with objects in a cleaner way.
//The main ones are: let, run, with, apply, also.
//| Function | Object Reference | Return Value     | Use Case                          |
//| -------- | ---------------- | ---------------- | --------------------------------- |
//| `let`    | `it`             | Result of lambda | Do something with non-null object |
//| `run`    | `this`           | Result of lambda | Execute block & return result     |
//| `with`   | `this`           | Result of lambda | Work with object (not extension)  |
//| `apply`  | `this`           | Object itself    | Configure object (builder style)  |
//| `also`   | `it`             | Object itself    | Extra operations (logging, debug) |


// Scope functions help manage object context and nullability.
fun main(){
    val name: String? = "Prakash"

// let → null check
    name?.let { println("Length: ${it.length}") }

// run → init and return value
    val message = "Hello".run {
        this.uppercase()
    }
    println(message) // HELLO

// apply → configure object
    val list = mutableListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }
    println(list) // [1, 2, 3]

// also → side effect (logging/debugging)
    val numbers = mutableListOf(1, 2, 3).also {
        println("Initial: $it")
    }

}

//👉 In Compose, apply is often used when building objects like Paint, Modifier chains, etc.
//👉 let is super common for handling nullable states safely in UI.