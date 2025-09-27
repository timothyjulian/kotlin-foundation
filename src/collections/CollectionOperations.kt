package collections

import dataset.Course
import dataset.CourseCategory
import dataset.KAFKA
import dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = {course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = {course: Course -> course.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

    val mapResult = list.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }


//    println("mapResult : $mapResult")
//    println("flatMapResult : $flatMapResult")

//    exploreFilter(courseList, designPredicate)
//    exploreMap(courseList, designPredicate)
//    val exploreFlatMap = exploreFlatMap(courseList, KAFKA)
//    println(exploreFlatMap)

//    exploreHashMap()
    collectionsNullability()
}

fun collectionsNullability() {
    var list : MutableList<String>? = null
    list = mutableListOf();

    list?.add("hehe")
    list?.forEach { println("test $it") }

    val list1: List<String?> = listOf("Hehe", null, "Hoho")
    list1.forEach {
        println("Lol ${it?.length}")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Tim" to 24, "Yenaaaaaaa" to 9)

    nameAgeMutableMap.forEach { (k, v) ->
        println("Key: $k and the value $v")
    }

    val value = nameAgeMutableMap.getOrElse("Tim1") { "asdasd" }
    println("Value is $value")

    val containsKey = nameAgeMutableMap.containsKey("abc")
    println("result is $containsKey")

    val filteredMap = nameAgeMutableMap
        .filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }
    println("maxAge $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String) : List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        val map = course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
        println(map)
        map
    }

    return kafkaCourses
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
