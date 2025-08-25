package Basic_DataTypes1

fun main(){
    // for loop
    for (i in 1..5) {
        println("For Iteration $i")
    }

    for(i in 5 downTo 1) {   // reverse order
        println("For Iteration $i in reverse")
    }

    for(i in 1 until 5){   // until is exclusive, 5 is not included
        println("For Iteration $i until 5")
    }

    for(i in 1..10 step 2){   // with 2 gap/step
        println("For Iteration $i with step 2")
    }

    for(i in 10 downTo 1 step 2){   // reverse order with 2 gap/step
        println("For Iteration $i in reverse with step 2")
    }

    // while loop
    var j = 1
    while (j <= 5) {
        println("While iteration $j")
        j++
    }

    // do-while loop
    var k = 1
    do {
        println("Do-while iteration $k")
        k++
    } while (k <= 5)

    val arr : Array<String> = arrayOf("Kotlin", "Java", "Python", "C++", "JavaScript")
    for(i in arr){
        println(i)
    }
    for(i in arr.reversed()){
        println(i)
    }
}