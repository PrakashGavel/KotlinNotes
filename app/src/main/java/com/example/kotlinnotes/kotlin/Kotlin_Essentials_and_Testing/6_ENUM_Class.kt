package Kotlin_Essentials_and_Testing

//Enum class defines a set of constants (fixed values).
enum class Diraction {
    NORTH, SOUTH, EAST, WEST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun printColor() = println("Color is $rgb")
}
fun main(){
    val move = Diraction.NORTH // Accessing an enum constant
    println(move) // Output: NORTH
    Color.RED.printColor()  // Color is 16711680, ✅ Enums can also hold properties & functions:
}

// 👉 In Compose, Enums are often used for things like UI themes, navigation states, modes.