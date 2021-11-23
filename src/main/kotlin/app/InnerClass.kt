package app

import data.Boss

fun main() {
    val boss1 = Boss("Linux")
    val employee1 = boss1.Employee("Tito")
    val employee2 = boss1.Employee("Edwin")

    employee1.hi()
    employee2.hi()
}