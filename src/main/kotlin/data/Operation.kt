package data

/*
 * Sealed Class
 * - didesain untuk inheritance
 * - tidak bisa diinstansiasi menjadi object
 * - merupakan abstract class
 */

sealed class Operation(val name: String)
class Plus: Operation("Plus")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")