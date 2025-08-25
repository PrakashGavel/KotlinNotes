package Basic_DataTypes1

fun main(){
    var userName = "Prakash"
    val userId = 12345
    var userAddress = "Bangalore"

    println("Username is "+userName) // string concatenation
    println("Username is {$userName}") // string interpolation
    println("Username is $userName") // string interpolation
    println("Userid and Useraddress is $userId and $userAddress") // string interpolation
    println("Userid and Useraddress are {$userId, $userAddress}") // string interpolation

    var a = 40
    var b = 50
    println("Sum of $a and $b is ${a + b}") // string interpolation with expression

    a = 10
    b = 20
    println("Sum of $a and $b is ${a + b}") // string interpolation with expression

    val name = "Prakash"      // Compiler infers 'String'
    val age = 25              // Compiler infers 'Int'
    val isStudent = true      // Compiler infers 'Boolean'

    println("Name: $name, Age: $age, Student: $isStudent")
}