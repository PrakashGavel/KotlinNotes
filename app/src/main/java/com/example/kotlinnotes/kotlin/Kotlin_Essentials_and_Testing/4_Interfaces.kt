package Kotlin_Essentials_and_Testing

//Defines a contract (what a class must do).
//
//A class can implement multiple interfaces (Kotlin supports multiple inheritance via interfaces).

interface Clickable {
    fun onClick()
}

class Button : Clickable {
    override fun onClick(){
        println("Button clicked!")
    }
}
fun main(){
    val btn = Button()
    btn.onClick()
}

// 👉 In Compose, interfaces are useful for defining contracts like UiEvent, Repository, or NavigationHandler.