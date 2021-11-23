package data

class Person(myFirstName: String, myLastName: String, myMiddleName: String? = null) {
    var firstName: String = myFirstName
    var middleName: String? = myMiddleName // tidak disarankan untuk membuat nullable var
    var lastName: String = myLastName

    // ini adalah initializer block
    // fungsinya untuk menjalankan
    // kode yang yang ada di dalam block
    // init saat membuat instance objek baru
    init {
        println("$myFirstName initialized")
    }

    fun fullName(): String {
        return "$firstName $middleName $lastName"
    }
}