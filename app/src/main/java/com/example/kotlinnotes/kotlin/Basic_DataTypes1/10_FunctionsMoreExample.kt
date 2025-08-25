package Basic_DataTypes1

fun countDigit1(number: Int): Int { // here return type is Int
    var count = 0
    var n = number
    while (n > 0) {
        val r = n % 10
        count++
        n /= 10
    }
    return count
}

fun sayHello(message: String = "how are you?", type: String = "success") {
    if (type == "success") {
        println("success: hello $message")
    }
    else if (type=="warning")
    {
        println("warning : Alert $message")
    }
}

fun main() {

    val resultCount = countDigit1(1212)
    println("Number of digit is $resultCount")

    println("Number of digit is ${countDigit1(13141)}")

    sayHello("I am fine","warning")
    sayHello()  // for this we are using default values,
    sayHello(type="warning", message = "This is special message") // we can change the order of parameters by using named arguments
}
