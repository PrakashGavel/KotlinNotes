package Basic_DataTypes1

import java.lang.reflect.Array


// "typealias" keyword is used to create an alias for a type
typealias Prakash = Int
// typealias NameList = Array<String>

fun main(){
    // "as" keyword is used for type casting
    val num1: Any = 10
    val num2 = num1 as Int // type casting from Any to Int
    println("The number is: $num2")

    // "is" keyword is used for type checking
    if (num2 is Int) {
        println("The num2 is of type Int")
    } else {
        println("The num2 is not an Int")
    }

    // "in" keyword is used to check if an element is present in a collection
    val list = listOf(1, 2, 3, 4, 5)
    if (3 in list) {
        println("3 is present in the list")
    } else {
        println("3 is not present in the list")
    }
    for(i in list) {
        println("Element: $i")
    }

    // using typealias, in the main function now we can use "Prakash" as an alias for "Int", everytime we use "Prakash" it is actually "Int"
    val num3: Prakash = 20 // using the alias, here instead of Int we are using Prakash as data type
    println(num3) // prints 20

    val num4: Prakash = 30
    println(num4) // prints 30

//    val names: NameList = arrayOf("Alice", "Bob", "Charlie")
//    for(i in names) {
//        println("Name: $i") // prints each name in the array
//    }

}
