package data

open class Shape {
    open val corner: Int = -1
}

class Triangle : Shape() {
    override val corner = 4
}

class Rectangle : Shape() {
    override val corner = 5
}

class Hexagon : Shape() {
    override val corner = 6
    val parentCorner: Int = super.corner // mendapatkan value dari parent class
}