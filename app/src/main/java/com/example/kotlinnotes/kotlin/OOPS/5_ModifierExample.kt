package OOPS

//In Kotlin, visibility modifiers are used to control the visibility of a class, its members (properties, functions, and nested classes), and its constructors.
//
//public: The public modifier makes a member visible to any code. This is the default visibility for members in Kotlin.
//
//private: The private modifier restricts the visibility of a member to the containing class only. A private member cannot be accessed from outside the class.
//
//internal: The internal modifier restricts the visibility of a member to the same module. A module is a set of Kotlin files compiled together.
//
//protected: The protected modifier restricts the visibility of a member to the containing class and its subclasses.

class ModifierExample {
    private var privateVariable: String = "I am private"
    var publicVariable: String = "I am public"
    private fun display(){
        println(privateVariable)
    }
    fun display2(){
        println(privateVariable) // This will work because display() is called within the class
        display() // This will work because display() is called within the class
    }
}

fun main(){
    var example = ModifierExample()
    example.publicVariable // Accessing public variable
//    example.privateVariable // This will cause an error because privateVariable is private to ModifierExample class
//    example.display() // This will also cause an error because display() is a private method
}