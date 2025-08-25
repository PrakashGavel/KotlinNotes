package Kotlin_Essentials_and_Testing

//Think of it as a way to define static members (like in Java) but more powerful.
//
//A companion object belongs to the class, not the instance.

class `2_Companion_Objects` {
}


class MathUtils(){
    companion object{
        fun square(x: Int): Int {
            return x * x
        }
    }
}
fun main(){
    println(MathUtils.square(5))  // Output: 25, (no need to create object)
}

//👉 In Compose, you might keep constants, helper functions, or factory methods inside a companion object.