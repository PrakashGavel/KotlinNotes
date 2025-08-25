package Collections2

fun main(){
    val map1 = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python") // Immutable Map
    println("Map1: $map1")

    val map2 = mutableMapOf("A" to 1, "B" to 2, "C" to 3) // Mutable Map
    println("Map2: $map2")

    map2["D"] = 4 // Adding an element to the mutable map
    println("Updated Map2: $map2")

    // removing an entry from the map
    map2.remove("A") // Removing an entry by key
    println("Map2 after removing entry with key 'A': $map2")

    // updating an entry in the map
    map2["B"] = 20 // Updating the value for key "B"
    println("Map2 after updating entry with key 'B': $map2")

    // iterating over the map
    for ((key, value) in map2) {
        println("Key: $key, Value: $value")
    }

    val firstEntry = map2.entries.first() // Accessing the first entry
    println("First Entry of Map2: $firstEntry")

    val lastEntry = map2.entries.last() // Accessing the last entry
    println("Last Entry of Map2: $lastEntry")

    val keys = map2.keys // Getting all keys
    println("Keys of Map2: $keys")

    val values = map2.values // Getting all values
    println("Values of Map2: $values")

    //////////////
    val countryCapitals: Map<String, String> = mapOf(
        "USA" to "Washington, D.C.",
        "France" to "Paris",
        "Japan" to "Tokyo"
    )

    println(countryCapitals["France"])  // Paris
    println(countryCapitals["Germany"]) // null (not found)

    for ((country, capital) in countryCapitals) {
        println("$country: $capital")
    }

    val studentGrades: MutableMap<String, Int> = mutableMapOf(
        "Alice" to 85,
        "Bob" to 92
    )

    studentGrades["Charlie"] = 78             // Add new entry
    studentGrades.put("Alice", 90)             // Update existing entry
    studentGrades.remove("Bob")                // Remove entry

    for ((student, grade) in studentGrades) {
        println("$student: $grade")
    }
}


//In Kotlin, Maps are collections of key-value pairs, allowing you to associate values with unique keys. Kotlin provides two primary types of maps:
//
//1. **Map** — read-only (immutable)
//2. **MutableMap** — mutable, allowing modifications like adding, removing, or updating entries
//
//---
//
//## Map (Immutable Map)
//
//- Cannot be changed after creation.
//- Use `mapOf()` to create an immutable map.
//
//### Creating a Map
//```kotlin
//val countryCapitals: Map<String, String> = mapOf(
//    "USA" to "Washington, D.C.",
//    "France" to "Paris",
//    "Japan" to "Tokyo"
//)
//```
//
//### Access values by key
//```kotlin
//println(countryCapitals["France"])  // Paris
//```
//
//### Iterate over map entries
//```kotlin
//for ((country, capital) in countryCapitals) {
//    println("$country: $capital")
//}
//```
//
//---
//
//## MutableMap
//
//- Supports adding, removing, updating entries.
//- Use `mutableMapOf()` to create a mutable map.
//
//### Creating a MutableMap
//```kotlin
//val studentGrades: MutableMap<String, Int> = mutableMapOf(
//    "Alice" to 85,
//    "Bob" to 92
//)
//```
//
//### Modifying the map
//```kotlin
//studentGrades["Charlie"] = 78             // Add new entry
//studentGrades.put("Alice", 90)             // Update existing entry
//studentGrades.remove("Bob")                // Remove entry
//```
//
//### Iterate over entries
//```kotlin
//for ((student, grade) in studentGrades) {
//    println("$student: $grade")
//}
//```
//
//---
//
//## Summary Table
//
//| Feature             | Map (Immutable)         | MutableMap                     |
//|---------------------|-------------------------|--------------------------------|
//| Creation            | `mapOf(...)`            | `mutableMapOf(...)`            |
//| Modification        | No                      | Yes                            |
//| Example Usage       | Read-only maps          | Dynamic maps, updates, removals |
//
//---
//
//## Example Program
//
//```kotlin
//fun main() {
//    // Immutable Map
//    val capitals = mapOf(
//        "India" to "New Delhi",
//        "Germany" to "Berlin"
//    )
//    println("Capital of India: ${capitals["India"]}")
//
//    // Mutable Map
//    val phoneBook = mutableMapOf(
//        "Alice" to "123-4567",
//        "Bob" to "987-6543"
//    )
//
//    // Add a new entry
//    phoneBook["Charlie"] = "555-0000"
//
//    // Update existing entry
//    phoneBook["Alice"] = "111-2222"
//
//    // Remove an entry
//    phoneBook.remove("Bob")
//
//    // Print all entries
//    for ((name, number) in phoneBook) {
//        println("$name: $number")
//    }
//}
//```
//
//---
//
