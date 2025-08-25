package Basic_DataTypes1

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 5
    println("Addition: ${a + b}")        // Addition
    println("Subtraction: ${a - b}")     // Subtraction
    println("Multiplication: ${a * b}")  // Multiplication
    println("Division: ${a / b}")        // Division
    println("Modulus: ${a % b}")         // Modulus

    println(a.plus(b))  // Using infix function for addition
    println(a.minus(b)) // Using infix function for subtraction
    println(a.times(b))  // Using infix function for multiplication
    println(a.div(b))   // Using infix function for division
    println(a.rem(b))   // Using infix function for modulus

    val d = 5
    println("Incremented value of d: ${d.inc()}") // Increment
    println("Decremented value of d: ${d.dec()}") // Decrement

    // Comparison Operators
    println("Is a equal to b? ${a == b}")          // Equal to
    println("Is a not equal to b? ${a != b}")      // Not equal to
    println("Is a greater than b? ${a > b}")       // Greater than
    println("Is a less than b? ${a < b}")          // Less than
    println("Is a greater than or equal to b? ${a >= b}")  // Greater than or equal to
    println("Is a less than or equal to b? ${a <= b}")     // Less than or equal to

    // Logical Operators
    val x = true
    val y = false
    println("Logical AND: ${x && y}")  // Logical AND
    println("Logical OR: ${x || y}")   // Logical OR
    println("Logical NOT: ${!x}")       // Logical NOT

    // Assignment Operators
    var c = 10
    c += 5  // c = c + 5
    println("After += : $c")

    c -= 3  // c = c - 3
    println("After -= : $c")

    c *= 2  // c = c * 2
    println("After *= : $c")

    c /= 4  // c = c / 4
    println("After /= : $c")

    c %= 3  // c = c % 3
    println("After %= : $c")
}