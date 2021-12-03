package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Linux")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("ada yang error: ${error.message}")
    } finally {
        println("Blok try catch sudah selesai")
    }
}