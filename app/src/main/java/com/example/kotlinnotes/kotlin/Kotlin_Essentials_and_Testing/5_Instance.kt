package Kotlin_Essentials_and_Testing

//An instance is simply an object that’s created from a class.
//
//Class = Blueprint
//
//Instance = Actual object created from that blueprint

class Car(val brand: String, val year: Int) {
    fun drive() {
        println("Driving $brand from $year 🚗")
    }
}

fun main() {
    // Creating instances (objects) of Car
    val car1 = Car("Tesla", 2023)
    val car2 = Car("Toyota", 2018)

    // Using the instances
    car1.drive()  // Driving Tesla from 2023 🚗
    car2.drive()  // Driving Toyota from 2018 🚗
}
// 👉 In Compose, instances are often used for state management, UI components, or data models.

//Difference Instance and Object in Kotlin Terms
//
//Instance → Any object created from a class. You can create multiple.
//
//Object (keyword) → Special construct in Kotlin for singletons or anonymous classes.

//Quick Analogy
//
//Class → Blueprint of a car.
//
//Instance / Object → Actual car built from the blueprint.
//
//object keyword in Kotlin → Government gives you exactly one official car 🚗, no matter how many times you ask.
//
//👉 So:
//
//In general OOP talk → object = instance (same thing).
//
//In Kotlin keyword object → it means a singleton (special case).