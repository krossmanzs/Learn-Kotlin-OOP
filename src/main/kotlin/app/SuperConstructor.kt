package app

import data.ExecutiveCustomer

fun main() {
    val customer1 = ExecutiveCustomer("Linux",1000)
    println("Nama: ${customer1.name}\nBalance: ${customer1.balance}\nTipe: ${customer1.type}")
}