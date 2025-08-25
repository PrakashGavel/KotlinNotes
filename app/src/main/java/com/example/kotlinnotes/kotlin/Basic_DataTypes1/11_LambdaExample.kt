package Basic_DataTypes1

fun main() {
    // High-order functions: Functions that can take other functions as parameters or return functions as results.
    // example of a high-order function: lambda function
    // lambda function: a function without a name
    val myVar = {  // here we are storing a lambda function in a variable called myVar
        println("Hello from lambda function")
        println("Sum of a and b is ${10 + 20}")
    }
    myVar() // calling myVar means calling the lambda function

    val result = { a:Int -> a*a} // lambda function with parameter, a as parameter and a*a as return value
    println("Square of 5 is ${result(5)}") // calling the lambda function with argument

    val result1 = { a:Int, b:Int -> a + b } // lambda function with two parameters, a and b, and a + b as return value
    println("Sum of a and b is ${result1(3, 4)}")
}