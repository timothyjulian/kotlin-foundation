package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = {course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = {course: Course -> course.category == CourseCategory.DESIGN }

//    exploreFilter(courseList, designPredicate)
    exploreMap(courseList, designPredicate)
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach {
            println(it)
        }
    println("courses: $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
//        .filter { predicate.invoke(it) }
        .filter(predicate)
        .forEach {
            println("Courses: $it")
        }

}
