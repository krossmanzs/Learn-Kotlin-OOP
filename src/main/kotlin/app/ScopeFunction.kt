package app

import data.Student

/**
 * Scope Functions
 *
 * Beberapa function yang bisa digunakan
 * unttuk mengeksekusi object dengan mudah
 * memanfaatkan lambda expression
 *
 * Function tersebut antara lain
 * Let
 * Digunakan sebagai reference block agar
 * kita bisa lebih mudah ketika ingin memanipulasi
 * sebuah object (it)
 *
 * Apply
 * mirip kaya run, bedanya adalah return value dari
 * apply adalah reference object itu sendiri
 *
 * Also
 * mirip let, bedanya return value nya adalah reference
 * ke object itu sendiri
 *
 * With
 * mirip run, bedanya with bukan extension function
 * jadi tidak bisa digunakan langsung dari objectnya
 *
 * Run
 * mirip kayak let, bedanya ga ada parameternya
 * sehingga kita tidak bisa mengakses reference
 * object menggunakan (it), tetapi bisa
 * menggunakan (this)
 *
 */

fun main() {
    val student = Student("Linux", 17)
    val result: String = student.let {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result)

    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    // apply, intinya jika kita melakukan apapun
    // kepada object student maka object tersebut
    // akan kembali lagi ke reference awal
    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result5)
}