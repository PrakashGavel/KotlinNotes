package Basic_DataTypes1

fun main(){
    println("Enter marks: ")
    val marks = readln().toInt()
//    val grade = if(marks in 90..100) {
//        "A+"
//    } else if(marks >= 80) {
//        "A"
//    } else if(marks >= 70) {
//        "B+"
//    } else if(marks >= 60) {
//        "B"
//    } else if(marks >= 50) {
//        "C"
//    } else if(marks >= 40) {
//        "D"
//    } else {
//        "F"
//    }

    val grade = when(marks) {  // when is like switch in other languages
         in 90..100 -> "A+"
         in 80..89 -> "A"
         in 70..79 -> "B+"
         in 60..69 -> "B"
         in 50..59 -> "C"
         in 40..49 -> "D"
         else -> "F"
    }
    println("Your grade is: $grade")
}