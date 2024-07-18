class House(
    val address: String,
    val floors: Int,
    val rooms: Int
) {
    constructor(address: String) : this(address, 2, 4) {
    }

    fun describeHouse() {
        println("House at $address with $floors floors and $rooms rooms.")
    }
}

fun main() {
    val house = House("123 Main St")
    house.describeHouse()

    val house1 = House("456 Elm St", 3, 5)
    house1.describeHouse()
}

