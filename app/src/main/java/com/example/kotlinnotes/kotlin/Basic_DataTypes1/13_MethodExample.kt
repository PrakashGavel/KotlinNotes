package Basic_DataTypes1

fun test1(){  // This is called functional programming
    println("Function outside the class")
}
class MethodExample {
    fun test2(){  // This is a method inside the class
        println("Function inside the class")
    }
}

fun main(){
    test1() // calling function outside the class
    val obj = MethodExample() // creating an object of MethodExample class
    obj.test2() // This is how we call a method of a class
}