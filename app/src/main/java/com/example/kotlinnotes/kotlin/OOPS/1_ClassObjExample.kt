package OOPS

//Class
//Class is blueprint for creating objects. Class can have properties and behaviours.
//
//Object
//Object is instance of class has properties and behaviors. We can create multiple objects for class.

fun main(){
//    val obj = Student() // Creating an object of Student class
//
//    println(obj.name) // Accessing the static property 'name' of the Student class
//    println(obj.age) // Accessing the instance property 'age' of the Student object
//    println(obj.address) // Accessing the instance property 'address' of the Student object
//
//    obj.name = "Ravi" // Modifying the static property 'name' of the Student class, we can do this because 'name' is a mutable (var) property, even object is immutable (val)
//
//    obj.displayInfo() // Calling the method to display student information

    val obj1 = Student1()
    obj1.name = "Prakash"
    obj1.age = 25
    obj1.address = "Bangalore"

    val obj2 = Student1()
    obj2.name = "Ravi"
    obj2.age = 30
    obj2.address = "Mumbai"

    obj1.displayInfo() // Displaying information of obj1
    obj2.displayInfo() // Displaying information of obj2
}

class Student1() {
//    var name: String = "Prakash"
//    var age: Int = 25
//    var address: String = "Bangalore"

    // properties
    var name: String = ""
    var age: Int = 0
    var address: String = ""

    // member function / behavior
    fun displayInfo() {
        println("Name: $name, Age: $age, Address: $address")
    }
}