class Book{
    val title: String
    val author: String
    val price: Double

    constructor(title: String, author: String, price: Double){
        this.title = title
        this.author = author
        this.price = price
    }
    constructor(title: String, author: String){
        this.title = title
        this.author = author
        this.price = 2000.0
    }
}

fun main()  {
    val book = Book("the Blossoms", "Rutomustgo")
    println("${book.author}, ${book.title}, ${book.price}")
    val book1 = Book("Glaze", "frankie", 3438423.00)
    println("${book1.author}, ${book1.title}, ${book1.price}")
}