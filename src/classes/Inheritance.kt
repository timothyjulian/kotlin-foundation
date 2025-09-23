package classes

open class User (val name: String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }
}


// Kotlin can only extend 1 class
class Student (name: String) : User(name) {
    override var isLoggedIn : Boolean = false
    override fun login() {
        println("Student login")
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Tim")
    student.login()
    println("name is ${student.name}")
    student.isLoggedIn = true
    println("Logged in value is: ${student.isLoggedIn}")

    val instructor = Instructor("Jul")
    instructor.login()
    println("name is ${instructor.name}")


}