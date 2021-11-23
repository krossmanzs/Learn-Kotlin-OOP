package data

/**
 * Inner Class
 * supaya class inner dapat mengakses
 * data yang ada di dalam class outer,
 * kita bisa menggunakan kata kunci inner
 */

class Boss(val bossName: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("Hi, my name is $name, my boss name is $bossName")
        }
    }
}