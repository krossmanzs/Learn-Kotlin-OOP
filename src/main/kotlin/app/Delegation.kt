package app

import data.AutoDelegate
import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase();
    base.sayHello("Linux")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Tito")
    baseDelegate.sayGoodbye("Linux")

    val autoDelegate = AutoDelegate(base)
    autoDelegate.sayHello("Linux")
    autoDelegate.sayGoodbye("Tito")
}