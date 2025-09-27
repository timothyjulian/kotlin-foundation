package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList
import kotlin.time.Clock

fun main() {
    val list = listOf("alex", "tim", "ahaheh")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()
    println("list: $list")

    exploreFilterSequence(courseList(), {course -> course.category == CourseCategory.DEVELOPEMENT})

    val range = 1..Int.MAX_VALUE

    val time = System.currentTimeMillis()
    // OOM
//    range.map { it.toDouble() }.forEach { "Value is $it" }
    range
        .asSequence() // useful because not needing intermediary sequence and process one by one, not whole by whole
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Value is $it") }
}

fun exploreFilterSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList.asSequence()
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
//        .filter { predicate.invoke(it) }
        .filter(predicate)
        .forEach {
            println("Courses: $it")
        }

}
