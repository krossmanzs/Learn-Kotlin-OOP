package app

import data.Application

typealias App = Application
typealias Aplikasi = App

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    println(app.name)

    sayHello { "Linux" }
}