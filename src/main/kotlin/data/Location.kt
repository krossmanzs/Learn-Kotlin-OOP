package data

// Abstract Class
// - tidak bisa dibuat object
// - hanya bisa di wariskan/diturunkan
// - bukan final lagi, sudah open
// - properties dan functionnya harus dibuat ulang di child classnya

abstract class Location(val name: String) {

}

class City(name: String) : Location(name)