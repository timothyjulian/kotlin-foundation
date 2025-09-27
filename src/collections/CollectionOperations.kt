package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = {course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = {course: Course -> course.category == CourseCategory.DESIGN }

    exploreFilter(courseList, designPredicate)
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
