package app

import data.Person

fun main() {
    val linux = Person("Cornelius","Linux")
    val edwin = Person("Edwin","Krisandika","Putra")

    val persons = arrayOf(linux, edwin)

    println()
    for (person in persons) {
        println(person.fullName())
    }
}