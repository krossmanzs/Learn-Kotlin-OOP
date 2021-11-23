package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation) : Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(1,5,Minus()))
    println(operation(1,5,Plus()))
    println(operation(1,5,Modulo()))
}