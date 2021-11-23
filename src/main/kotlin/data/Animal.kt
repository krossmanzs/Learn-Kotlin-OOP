package data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    init {
        println("Cat created!")
    }

    override val name: String = "Cat"

    override fun run() {
        println("Cat running")
    }
}

class Dog : Animal() {
    init {
        println("Dog created!")
    }

    override val name: String = "Dog"

    override fun run() {
        println("Dog running")
    }

}