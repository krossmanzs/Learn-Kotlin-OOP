package app

import data.User

fun main() {
    val user1 = User(password = "wow123",username = "keren")
    val user2 = User("anjay","123","awokawo@gmial.com")

    val users = arrayOf(user1, user2)

    for (user in users) {
        println("==============")
        println("Username:\t $user")
        println("Password:\t ${user.password}")
        println("Email:\t ${user.email}")
    }
}