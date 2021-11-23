package data

// Interface
// - blueprint, prototype, atau cetakan di kotlin
// - semua prop dan funcnya adalah abstract

interface Interaction {
    val name: String
    fun sayHello(name: String) { // Concrete function
        println("Hello $name, my name is ${this.name}")
    }
}

// Interface bisa menginherit Interface
// tetapi tidak bisa jika menginherit class
interface Go : Interaction{
    fun go() {
        println("Go!")
    }
}

class Human(override val name: String) : Go {
}