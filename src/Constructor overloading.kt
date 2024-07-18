class Person {
    var name: String
    var age: Int
    var city: String

    // Primary constructor that takes all three properties as parameters
    constructor(name: String, age: Int, city: String) {
        this.name = name
        this.age = age
        this.city = city
    }

    // Secondary constructor that takes only name and age (sets city to a default value)
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        this.city = "Unknown"
    }

    fun introduce() {
        println("My name is $name, I am $age years old and I live in $city.")
    }
}

fun main() {
    // Using primary constructor
    val person1 = Person("Alice", 30, "New York")
    person1.introduce()

    // Using secondary constructor
    val person2 = Person("Bob", 25)
    person2.introduce()
}

