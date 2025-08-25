package OOPS

//In Kotlin, setter is used to set the value of any variable and getter is used to get the value.
//
//Getters and Setters are auto-generated in the code.
//
//we can create own implementation of getter and setters

class User {
    var userId : String = "defaultId"
        get(){
            println("getting values")
            return field // 'field' refers to the backing field of the property
        }
        set(value) {
            println("setting values")
            field = value
        }
}

fun main(){
    val user = User()
    println("User ID: ${user.userId}") // Accessing the property using getter, here its calling the getter method automatically
    user.userId = "newUserId" // Setting a new value using setter, here it calls the setter method automatically
    println("Updated User ID: ${user.userId}") // Accessing the updated property using getter
}