class Car{
    var make: String = "none"
    var model: String = "none"
    var year: Int = 2000

    constructor(make: String, model: String, year: Int){
        this.year = year
        this.make = make
        this.model = model

    }
}

fun main() {
    val car1 = Car("BMW", "M4", 2022)
    println(" in two years my car will be ${car1.make}, ${car1.model}, ${car1.year}")
}