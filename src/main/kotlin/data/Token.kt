package data

import java.util.*

inline class Token(val value: String) {
    fun toUpper(): String = value.uppercase(Locale.getDefault())
}