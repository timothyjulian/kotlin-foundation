package classes

data class Course (
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1, "Rust Programming", "Tim")
    println("course name $course")

    val course2 = Course(1, "Rust Programming", "Tim")
    println("same: ${course == course2}")

    val course3 = course.copy(id = 5)
    println("hehe: $course3")

}