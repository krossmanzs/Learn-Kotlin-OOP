package app

import data.Car
import data.Customer

fun printObject(any: Any) {
    when(any) {
        is Customer -> println(any.name) // smart cast
        is Car -> println(any.type)
        else -> println(any)
    }
}

fun printString(any: Any) {
    // memaksa tipe data menjadi string
//    val value = any as String // unsafe cast
    val value = any as? String // safe nullable cast
    println(value)
}

fun main() {
    printObject(5)
    printObject("WOW")
    printObject(Customer("Linux"))
    printObject(Car("Toyota"))

    printString("wow")
    // ERROR ClassCastException
//    printString(2)
}