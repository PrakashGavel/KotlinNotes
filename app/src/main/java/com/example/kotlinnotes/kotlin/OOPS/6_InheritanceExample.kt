package OOPS

open class Samosa {  // parent class, we use "open" keyword for parent class to allow inheritance
    var x = 10
    fun displayX() {
        println("Samosa display")
    }
}

open class MeethaSamosa : Samosa() {  // child class inheriting from Samosa
    var y = 20
    fun displayY() {
        println("MeethaSamosa display")
    }
}

class BekarSamosa :  MeethaSamosa(){
    var bekarProp = println("I am a child of MeethaSamosa")
}

fun main() {
    val meethaSamosa = MeethaSamosa()
    meethaSamosa.displayX() // Output: Samosa display
    meethaSamosa.displayY() // Output: MeethaSamosa display
    println("MeethaSamosa x: ${meethaSamosa.x}") // Output: MeethaSamosa x: 10
    println("MeethaSamosa y: ${meethaSamosa.y}") // Output: MeethaSamosa y: 20

    val bekarSamosa = BekarSamosa()
    println(bekarSamosa.bekarProp) // Output: I am a child of MeethaSamosa
    bekarSamosa.displayX() // Output: Samosa display
    bekarSamosa.displayY() // Output: MeethaSamosa display
}