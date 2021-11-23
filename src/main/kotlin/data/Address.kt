package data

class Address {
    var street: String = ""
    var country: String = "Indonesia" // default value
    var rtrw: String = ""

    constructor(paramStreet: String, paramCountry: String, paramRTRW: String) {
        println("Constructor 1")

        street = paramStreet
        rtrw = paramRTRW
        country = paramCountry

        println("Anda tinggal di jl. ${street},${rtrw},${country}")
    }

    constructor(paramStreet: String, paramRTRW: String) :
            this(paramStreet,"Irlandia",paramRTRW) { // tidak wajib memanggil constructor lain
        println("Constructor 2")

        street = paramStreet
        rtrw = paramRTRW

        println("Anda tinggal di jl. ${street},${rtrw},${country}")
    }
}