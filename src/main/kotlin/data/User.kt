package data

class User (
    val username: String,
    val password: String,
    val email: String? = null) {

    override fun toString(): String {
        return username
    }
}