class Student(val name: String, val age: Int, val grade: String = "A") {

    init {
        println("New Student object created: Name - '$name', Age - $age, Grade - $grade")
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, grade='$grade')"
    }
}

fun main() {
    val student = Student("Frankie", 22)
    println(student)

    val student1 = Student("Frankie", 22, "B")
    println(student1)
}

