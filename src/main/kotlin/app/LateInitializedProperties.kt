package app

import data.Television

fun main() {
    val television = Television()
    // ERROR kotlin.UninitializedPropertyAccessException
//    println(television.brand)

    television.initTelevision("Panasonic")
    println(television.brand)
}