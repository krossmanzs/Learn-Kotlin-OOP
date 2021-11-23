package app

import data.Company

fun main() {
    val company1 = Company("PT Harapan Jaya")
    val company2 = Company("PT Mencari Cinta Sejati")
    val company3 = Company("PT Harapan Jaya")

    println(company1 == company2)
    println(company3 == company1)
    println()
    println(company1.hashCode())
    println(company2.hashCode())
    println(company3.hashCode())
    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company3.hashCode())
}