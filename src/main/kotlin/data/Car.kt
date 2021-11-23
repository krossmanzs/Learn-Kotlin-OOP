package data

class Car(typeCar: String,
            merkCar: String) {

    init {
        println("$merkCar dibuat dengan tipe $typeCar")
    }

    var type: String = typeCar
    var merk: String = merkCar

    constructor(typeCar: String) : this(typeCar, "wow") {
        println("Secondary Constructor")
    }
}