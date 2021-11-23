package data

// Late Initialization Properties
// digunakan untuk menginisialisasi
// properties yang belum di inisialisasi
// pada saat membuat objek

class Television {
    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}