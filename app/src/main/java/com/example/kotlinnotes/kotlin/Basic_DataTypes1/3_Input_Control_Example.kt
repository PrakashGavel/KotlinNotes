package Basic_DataTypes1

fun main() {
    // readln(), readline(), readlnOrNull() => for user input in Kotlin.
    println("Enter Name: ")
    val name = readln()
    println("Hello, $name!")

    println("Enter Address: ")
    val address = readlnOrNull()
    println("Address, $address")

    println("Enter Number: ")
    val number = readln().toInt()
    println("Your number is: $number")

    // Conditional Statements: if-else, if-elseif-else, when
    if (number > 0) {
        println("The number is positive.")
    } else if (number < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }

    when (number) {
        in 1..10 -> println("The number is between 1 and 10.")
        in 11..20 -> println("The number is between 11 and 20.")
        else -> println("The number is outside the range of 1 to 20.")
    }

    // In kotlin if-else is an expression, so it can return a value.
//    val result = if (number % 2 == 0) {
//        "The number is even."      // as an expression
//    } else {
//        "The number is odd."
//    }
//    println(result)

    println("Enter num1 and num2")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val result = if(num1>=num2){    // as an expression
        num1
    }
    else{
        num2
    }
    println(result)

}