package data

class Employee {
    open class Employee(open val name: String) {
        open fun sayHello(name: String) {
            println("Hello $name, my name is ${this.name}")
        }
    }

    // secara default class di kotlin adalah final
    open class Manager(name: String) : Employee(name) {
        final override fun sayHello(name: String) {
            println("Halo $name, saya adalah Manager, nama saya adalah ${this.name}")
        }
    }

    class SuperManager(name: String) : Manager(name) {
        // ERROR
//        override fun sayHello(name: String) {
//            println("Halo $name, saya adalah Super Manager, nama saya adalah ${this.name}")
//        }
    }
}