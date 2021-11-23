package data

/*
 *  Data Class
 *  class yang secara otomatis akan
 *  membuatkan function equals, hashCode,
 *  toString dan copy dari semua properties
 *  yang terdapat di primary constructors
 *  si data class
 */

data class Product(val name: String,
              val price: Int,
              val category: String)