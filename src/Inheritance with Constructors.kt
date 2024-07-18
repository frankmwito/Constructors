//Base class
open class Vehicle(
    val brand: String,
    val year: Int
){

}

//Derived class
class Truck(
    brand: String,
    year: Int,
    val capacity: Int
): Vehicle(brand, year){

}
fun main() {
    // Create an instance of Truck
    val truck = Truck("Ford", 2020, 1500)
    println("Brand: ${truck.brand}, Year: ${truck.year}, Capacity: ${truck.capacity} kg")
}

