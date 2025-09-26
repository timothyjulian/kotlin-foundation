package interfaces

import classes.Course

interface CourseRepository {
    val isCoursePersisted : Boolean

    fun getById(id: Int): Course

    fun save(course: Course) : Int {
        println("course : $course saved")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Rust Programming", "Tim")
    }

    override fun getAll(): Any {
        return 10
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }


}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Rust Programming", "Tim")
    }

    override fun save(course: Course): Int {
        println("course no sql : $course saved")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<B>.doSomething()
        super<A>.doSomething()
    }

}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(5)
    println("$course")
    println(sqlCourseRepository.save(course))

    println("persisted: ${sqlCourseRepository.isCoursePersisted}")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(10)
    println("$course2")
    println(noSqlCourseRepository.save(course2))

    val ab = AB()
    ab.doSomething()
}