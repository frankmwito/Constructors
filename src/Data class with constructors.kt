
data class Employee(//Define the primary constructor with all three properties.
    val id : Int,
    val name : String,
    val department : String
){
    //Define a secondary constructor that initializes the id property with a default value and calls the primary constructor.
    constructor(name: String, department: String) : this(0,name, department) {
    }
}

fun main()  {
    // Using the primary constructor
    val employee1 = Employee(1, "John Doe", "Engineering")
    println(employee1)

    // Using the secondary constructor
    val employee2 = Employee("Jane Smith", "Marketing")
    println(employee2)
}