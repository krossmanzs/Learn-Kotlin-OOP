package app

import data.Game
import data.Login
import data.MinMax

/**
 * Destructuring Declarations
 *
 * membuat multiple variables dari
 * sebuah object
 *
 * Destructuring di Function
 * kita bisa mengembalikan multiple return
 * value pada function
 */

fun minMax(value1: Int, value2: Int) : MinMax {
    return when {
        value1 > value2 -> MinMax(value2,value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login,callback: (Login) -> Boolean ) : Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Free Fire",0)
    val (name,price) = game
    println("""
        $name
        $price
    """.trimIndent())

    val (min,_) = minMax(100,10)
    println("""
        $min
    """.trimIndent())

    val login = Login("linux","kepo")
//    login(login){
//        it.username == "linux" && it.password == "kepo"
//    }
    login(login){ (username, password) ->
        username == "linux" && password == "kepo"
    }
}