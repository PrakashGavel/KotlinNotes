package OOPS

class car (){
    var carModel: String = ""  // creating instance variables
    var carColor: String = ""
    var carPrice: Int = 0
    // we can create multiple constructors in a class, this is called constructor overloading
    constructor(model: String, color: String) : this() {  // secondary constructor
        println("Secondary constructor with 2 parameter called")
        this.carModel = model
        this.carColor = color
      //  println("Creating car with model: $carModel and color: $carColor")
    }

    constructor(model: String, color: String, price: Int) : this() {  // constructor overloading
        println("Secondary constructor with 3 parameters called")
        this.carModel = model
        this.carColor = color
        this.carPrice = price  // this.price means the instance variable price (line 6) and price is the parameter passed to the constructor (line 15)
       // println("Creating car with model: $carModel, color: $carColor and price: $carPrice")
    }

    constructor(n1:Int, str:String) : this() {
        println("Secondary constructor with one Int and one String parameter called")
    }

    constructor(str:String, n1:Int) : this() {
        println()
    }
    fun carDetails() {
        println("Car Model: $carModel, Car Color: $carColor, Car Price: $carPrice")
    }
}

fun main(){
    val car1 = car("Lambo", "Yellow")
    car1.carDetails()
//    println(car1.carModel)
//    println(car1.carColor)

    val car2 = car("Ferrari", "Red", 1000000)
    car2.carDetails()
}