package classes

open class User (val name: String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside user Login")
    }

    private fun secret() {
        println("secret function")
    }

    protected open fun logout() {
        println("logout")
    }
}


// Kotlin can only extend 1 class
class Student (name: String) : User(name) {
    override var isLoggedIn : Boolean = false

    companion object {
        const val enrolledCourses = 10
        fun country() : String {
            return "USA"
        }
    }

    // the default is public
    override fun login() {
        println("Student login")
        super.login()
    }

    public override fun logout() {
        super.logout()
        println("Inside student logout")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Tim")
    student.login()
    println("name is ${student.name}")
    student.isLoggedIn = true
    student.logout()
    println("Logged in value is: ${student.isLoggedIn}")

    println(Student.country())
    println(Student.enrolledCourses)

    val instructor = Instructor("Jul")
    instructor.login()
    println("name is ${instructor.name}")

    val user = User("User")


}