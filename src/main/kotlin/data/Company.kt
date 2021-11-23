package data

class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Company -> name == other.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}