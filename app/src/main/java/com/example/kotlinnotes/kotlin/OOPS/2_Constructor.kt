package OOPS

// Constructor:
// Constructors are like member functions that are called when object of the class is created, we do not need to call them explicitly , they initilize the data members for objects
fun main(){
    val obj1 = Student2("Prakash", 25, "Bangalore") // Creating an object of Student class with parameters
    val obj2 = Student2("Ravi", 30, "Mumbai") // Creating another object of Student class with different parameters
    obj1.displayInfo() // Displaying information of obj1
    obj2.displayInfo() // Displaying information of obj2
}


// Primary constructor: It is defined in the class header and can have parameters.
class Student2(
    val name: String,
    val age: Int,
    val address: String
){
    // with initializer block
    init {
        println("Creating object")
    }
    // member function / behavior
    fun displayInfo() {
        println("Name: $name, Age: $age, Address: $address")
    }
}