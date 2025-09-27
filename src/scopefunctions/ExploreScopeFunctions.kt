package scopefunctions

import classes.Course
import classes.CourseCategory

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result =numbers.run {
        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers.sum()
    }

    println(result)
    val len = run {
        val name = "Tim"
        println(name)
        name.length
    }
    println(len)
}

fun exploreWith() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = with(numbers) {
        println("Size is $size")
        this.plus(6).sum()
    }

    println("With result is $result")
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 4, 5)
    val result = numbers.map { it*2 }.filter { it > 5 }.let {
        println(it)
        it.sum() // return value
    }

    println(result)

    var name : String? = null
    name = "Tim"
    var result1 = name?.let {
        println(name)
        it.uppercase()
    }
    println(result1)
}

fun exploreApply() {
    val course = Course(1, "Rust Programming", "Tim").apply { // apply is for object configuration
        courseCategory = CourseCategory.DESIGN
    }

    println("course: $course")
}

fun exploreAlso() {
    val course = Course(1, "Rust Programming", "Tim").also { // also is for additional effect
//        it.courseCategory = CourseCategory.DESIGN
        println("Course it: $it")
    }
}