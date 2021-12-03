package app

import data.Employee

/**
 * Polymorphism
 *
 * perubahan bentuk
 */

fun main() {
    var employee = Employee.Employee("Linux")
    employee.sayHello("Titot")

    employee = Employee.Manager("Linux")
    employee.sayHello("Titot")
}