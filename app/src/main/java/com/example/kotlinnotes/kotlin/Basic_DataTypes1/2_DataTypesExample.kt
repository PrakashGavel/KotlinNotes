package Basic_DataTypes1

class User(val name: String, val id: Int, val city: String) {
    // Class to represent a user with name, id, and city
    fun displayUserInfo() {
        // Method to display user information
        println("User Name: $name")
        println("User ID: $id")
        println("User City: $city")
    }
}

fun main(){
    val name = "Prakash"      // Compiler infers 'String'
    val age = 25              // Compiler infers 'Int'
    val isStudent = true      // Compiler infers 'Boolean'

    println("Name: $name, Age: $age, Student: $isStudent")

    val num1 : Byte = 10
    val num2 : Short = 20
    val mun3 : Int = 30
    val num4 : Long = 4000000L

    val num5 : Float = 10.5F
    val num6 : Double = 2076.5

    val ch : Char = 'A'
    val isActive : Boolean = true
    val userName : String = "Ram Gavel"
    val message : Any = "This is a string" // 'Any' can hold any type of value
    val num7 : Any = 100 // 'Any' can also hold a number

    val arr1 : Array<Int> = arrayOf(1, 2, 3, 4, 5) // Array of integers
    var arr2 : Array<String> = arrayOf("Kotlin", "Java", "Python") // Array of strings

    println(arr2[0]) // Accessing the first element of arr2
    println(arr2[1]) // Accessing the second element of arr2

    arr2[2] = "JavaScript" // Changing the third element of arr2
    println(arr2[2]) // Accessing the updated third element of arr2

    // user defined data type
    val user1 : User = User("Prakash", 12345, "Bangalore")
//    println(user1.name) // Accessing the name property of user1
//    println(user1.id)   // Accessing the id property of user1
//    println(user1.city) // Accessing the city property of user1
    user1.displayUserInfo() // Calling the method to display user information

    var value1=50
    var value2:Long=value1.toLong() // Converting value1 (Int) to Long and assigning it to value2
    println("value1: $value1, value2: $value2") // Displaying the values of value1 and value2
}