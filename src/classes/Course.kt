package classes

data class Course (
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

enum class Test(val test: String) {
    DEVELOPMENT("haha")
}

fun main() {
    val course = Course(1, "Rust Programming", "Tim")
    println("course name $course")

    val course2 = Course(1, "Rust Programming", "Tim")
    println("same: ${course == course2}")

    val course3 = course.copy(id = 5)
    println("hehe: $course3")

    val marketingCourse = Course(2, "Facebook Marketing", "Dilip", CourseCategory.MARKETING)
    println("$marketingCourse")

    val a = Test.DEVELOPMENT;
    println(a.test)
}