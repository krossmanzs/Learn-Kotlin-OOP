package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    Memaksa menjadi non nullable type
    val name = friend!!.name
    println("Hello $name")

//    Menggunakan Elvis operator
//    val name = friend?.name ?: ""
//    println("Hello $name")

//    if (friend != null) {
//        println("Hello ${friend.name}")
//    }
}

fun main() {
    sayHello(Friend("Linux"))
    sayHello(null)
}