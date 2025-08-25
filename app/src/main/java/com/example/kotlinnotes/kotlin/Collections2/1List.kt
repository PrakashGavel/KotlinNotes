package Collections2

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5) // Immutable List (cannot update/change)
    println("List1: $list1")

    val list2 = mutableListOf("Kotlin", "Java", "Python") // Mutable List (can update/change)
    println("List2: $list2")

    list2.add("JavaScript") // Adding an element to the mutable list
    println("Updated List2: $list2")

    val firstElement = list2.first() // Accessing the first element
    println("First Element of List2: $firstElement")

    val lastElement = list2.last() // Accessing the last element
    println("Last Element of List2: $lastElement")

    ///////////////
    // Immutable List Example
    val fruits: List<String> = listOf("Apple", "Banana", "Cherry")
    println("Fruits List: $fruits")
    println(fruits[0]) // Apple
    println(fruits[1])
    println(fruits.get(1)) // Banana
    println("Size of Fruits List: ${fruits.size}") // Size of the list
    for (i in fruits) {
        println(i)
    }

    // Mutable List Example
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    for (i in numbers) {
        println(i)
    }
    numbers.add(4) // Adding an element to the mutable list
    println("Numbers List: $numbers")
    numbers.removeAt(0) // Removing the first element
    println("Updated Numbers List: $numbers")
    numbers[0] = 10 // Changing the first element
    println("After changing first element: $numbers")
    numbers.clear() // Clearing the list
    println("After clearing the list: $numbers")

}


//In Kotlin, lists are ordered collections of items. Kotlin provides two main types of lists:
//
//1. **List** — read-only list (immutable)
//2. **MutableList** — a list that supports modification (mutable)
//
//Here's an overview of each, along with examples:
//
//---
//
//## List (Immutable List)
//
//- Cannot be changed after creation.
//- Supports read-only operations like iteration, accessing elements, etc.
//- Use `listOf()` function to create a list.
//
//### Creating a List
//```kotlin
//val fruits: List<String> = listOf("Apple", "Banana", "Cherry")
//```
//
//### Access elements
//```kotlin
//println(fruits[0]) // Apple
//println(fruits.get(1)) // Banana
//```
//
//### Iterate over a list
//```kotlin
//for (fruit in fruits) {
//    println(fruit)
//}
//```
//
//### Note
//Since `List` is immutable, you cannot add or remove items.
//
//---
//
//## MutableList
//
//- Supports adding, removing, updating elements.
//- Use `mutableListOf()` function to create a mutable list.
//
//### Creating a MutableList
//```kotlin
//val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
//```
//
//### Modify the list
//```kotlin
//numbers.add(4)           // [1, 2, 3, 4]
//numbers.remove(2)        // [1, 3, 4]
//numbers[0] = 10          // [10, 3, 4]
//```
//
//### Iterate over a mutable list
//```kotlin
//for (number in numbers) {
//    println(number)
//}
//```
//
//---
//
//## Summary Table
//
//| Feature            | List (Immutable)           | MutableList                     |
//|--------------------|----------------------------|--------------------------------|
//| Creation           | `listOf(...)`              | `mutableListOf(...)`           |
//| Modification       | No                         | Yes                            |
//| Example Usage      | Read-only, constants       | Adding/removing elements, populating |
//
//---
//
//## Example Program
//
//```kotlin
//fun main() {
//    // Immutable list
//    val colors: List<String> = listOf("Red", "Green", "Blue")
//    println("Colors: $colors")
//    println("First color: ${colors[0]}") // Red
//
//    // Mutable list
//    val animals: MutableList<String> = mutableListOf("Dog", "Cat")
//    animals.add("Horse")
//    println("Animals: $animals")
//    animals.removeAt(1)
//    println("Updated Animals: $animals")
//}
//```
//
//---
//
