package Kotlin_Essentials_and_Testing

//A class is a blueprint for creating objects (instances).
//
//In Kotlin, classes are simple by default (no need to declare public class).

class Person(val name: String, val age: Int){
    fun introduce(){
        println("My name is $name and I am $age years old")
    }
}
fun main(){
    val p1 = Person("Prakash",24)
    p1.introduce()
}

//In Compose, we often use classes for data models, e.g. data class User(val name: String, val email: String).