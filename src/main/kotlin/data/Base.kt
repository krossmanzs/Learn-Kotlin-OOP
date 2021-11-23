package data

/**
 * Delegation
 * meneruskan properties atau function
 * ke object yang lain
 */

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

// Manual Delegation
class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        base.sayGoodbye(name)
    }
}

// Automatic Delegation
class AutoDelegate(private val base: Base) : Base by base;