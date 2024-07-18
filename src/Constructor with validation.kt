class Product {
    val name: String
    val price: Double
    val quantity: Int

    constructor(name: String, price: Double, quantity: Int) {
        require(price >= 0) { "Price must be non-negative" }
        require(quantity >= 0) { "Quantity must be non-negative" }

        this.name = name
        this.price = price
        this.quantity = quantity
    }
}

fun main() {
    try {
        val product = Product("Turbo kit", -34354.443, 5342)
        println("Product details: ${product.name}, ${product.price}, ${product.quantity}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
