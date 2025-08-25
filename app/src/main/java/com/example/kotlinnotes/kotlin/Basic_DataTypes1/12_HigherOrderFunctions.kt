package Basic_DataTypes1

// calling callback function without parameters and returning Unit
fun sumTwoNumbers(a: Int, b: Int, callback: () -> Unit) { // here callback is a higher-order function that takes no parameters as () and returns Unit (similar to void in other languages)
    val sum = a + b
    println("Sum of $a and $b is $sum")
    callback() // calling the callback function after the sum is calculated
}

// calling callback function with parameter String and returning Unit
fun cube(number : Int, callback: (message: String) -> Unit){ // here callback function is taking one argument as String
    val res = number*number*number
    println("Cube of number is: $res")
    callback("Cube calculated")
}

fun main(){
    val callbackFunction = {
        println("Sum is completed")
    }
    sumTwoNumbers(10, 20, callbackFunction) // passing callbackFunction in sumTwoNumbers function
    sumTwoNumbers(2, 3, {
        println("This is lambda function passing as a higher order function")
    })

    // or
    sumTwoNumbers(2, 3) {  // when lambda function is in last position the we can pass it like this
        println("This is lambda function passing as a higher order function")
    }

    cube(3) {
        println(it) // 'it' is the implicit name of a single parameter in a lambda function, for example, here it is the message passed to the callback function
    }


}