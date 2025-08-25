package Collections2

fun main(){
    // array
    val array1 = arrayOf(1, 2, 3, 4, 5) // Immutable Array
    println("Array1: ${array1.joinToString(", ")}")
    for(i in array1) {
        print("$i, ")
    }
    println()
    val squares = Array(5) { i -> i * i } // [0, 1, 4, 9, 16]
    println("Squares: ${squares.joinToString(", ")}")
}