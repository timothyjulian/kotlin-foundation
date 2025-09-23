package classes

open class User (val name: String) {
    fun login() {
        println("Inside user Login")
    }
}


// Kotlin can only extend 1 class
class Student (name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Tim")
    student.login()
    println("name is ${student.name}")

    val instructor = Instructor("Jul")
    instructor.login()
    println("name is ${instructor.name}")


}