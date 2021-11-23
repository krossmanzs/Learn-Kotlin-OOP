package data

import java.util.*

/**
 * Singleton Object
 * sebuah object/class yang hanya
 * dibuat sekali untuk satu cycle app
 */

object Utilities {
    const val name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase(Locale.getDefault())
    }
}