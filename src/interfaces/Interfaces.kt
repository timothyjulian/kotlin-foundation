package interfaces

import classes.Course

interface CourseRepository {
    fun getById(id: Int): Course

    fun save(course: Course) : Int {
        println("course : $course saved")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Rust Programming", "Tim")
    }

}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Rust Programming", "Tim")
    }

    override fun save(course: Course): Int {
        println("course no sql : $course saved")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(5)
    println("$course")
    println(sqlCourseRepository.save(course))

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(10)
    println("$course2")
    println(noSqlCourseRepository.save(course2))

}