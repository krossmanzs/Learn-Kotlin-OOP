package app

import data.Product

fun main() {
    val product = Product("Sarimi",3000,"Food")
    println(product)

    val product2 = product.copy(name = "Indomie", price = 2000)
    println(product2)
}