package data

import java.util.*

/**
 * Companion Object
 * kemampuan membuat inner object
 * di dalam class, tanpa harus
 * menggunakan nama object (tidak wajib)
 */

class Application(val name: String) {
    companion object {
        fun toUpper(name: String) : String {
            return name.uppercase(Locale.getDefault())
        }
    }
}