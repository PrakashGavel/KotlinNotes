package Basic_DataTypes1

fun main(){
    var name: String = "Kotlin"  // Non-nullable Types
    var nickname: String ?= null  // Nullable Types
    val length = nickname?.length // Safe Call Operator (?.)
    println("Length of nickname: $length") // Will print "Length of nickname: null"
    val displayName = nickname ?: "Default Name" // Elvis  Operator (?:)
    println("Display Name: $displayName") // Will print "Display Name: Default Name",
    println("Length of displayName: ${displayName.length}") // Will print length of "Default Name"

    val length1 = nickname!!.length // Not-null Assertion (!!)
    println("Length of nickname: $length1") // Will throw NullPointerException if nickname is null

}


//Null safety in Kotlin is a core feature designed to eliminate the prevalent problem of null reference exceptions (often called the "billion-dollar mistake"). Kotlin's type system distinguishes between nullable and non-nullable types, enforcing compile-time checks that prevent null-related errors.
//
//### Key Concepts of Null Safety in Kotlin
//
//1. **Non-nullable Types:**
//By default, types in Kotlin are non-nullable. For example:
//```kotlin
//var name: String = "Kotlin"
//```
//This variable `name` cannot be assigned `null`. Attempting to do so will result in a compile-time error.
//
//2. **Nullable Types:**
//To allow a variable to hold `null`, you declare it with a question mark (`?`):
//```kotlin
//var nickname: String? = null
//```
//Now, `nickname` can hold either a `String` value or `null`.
//
//3. **Safe Calls (`?.`):**
//To call a method or access a property on a nullable object safely, use the safe call operator:
//```kotlin
//val length = nickname?.length
//```
//If `nickname` is `null`, `length` will be `null`; otherwise, it computes the length.
//
//4. **Elvis Operator (`?:`):**
//Provides a default value if the expression on the left is `null`:
//```kotlin
//val displayName = nickname ?: "Default Name"
//```
//
//5. **Not-null Assertion (`!!`):**
//Converts a nullable type to a non-nullable type, throwing a `NullPointerException` if the value is `null`:
//```kotlin
//val length = nickname!!.length
//```
//Use this cautiously, as it can lead to runtime exceptions.
//
//6. **Safe Casts (`as?`):**
//Attempts to cast a value to a type, returning `null` if the cast fails:
//```kotlin
//val obj: Any = "Kotlin"
//val stringObj: String? = obj as? String
//```
//
//### Summary
//Kotlin's null safety features enforce better handling of nulls at compile time, reducing runtime errors. By explicitly declaring nullable types and utilizing safe operators, developers write safer, more robust code.
//
//### Example:
//```kotlin
//fun main() {
//    val name: String = "Kotlin"         // Non-nullable
//    val nickname: String? = null        // Nullable
//
//    // Safe call
//    println(nickname?.length)           // Prints null
//
//    // Elvis operator
//    val displayName = nickname ?: "Guest"
//    println(displayName)                // Prints "Guest"
//
//    // Not-null assertion (be careful!)
//    // println(nickname!!.length)       // Throws NullPointerException if nickname is null
//}
//```

