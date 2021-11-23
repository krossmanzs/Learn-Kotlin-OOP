package data

/**
 * Enum Class
 * digunakan untuk jenis data yang
 * sudah baku, seperti jenis kelamin,
 * arah mata angin dan sejenisnya
 */

enum class Gender(private val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println(description)
    }
}