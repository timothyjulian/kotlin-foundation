package cast

import classes.Course

fun main() {
    val course = Course(1, "Rust Programming", "Tim")

    checkType(course)
    checkType("DILIP")

    castNumber(1.0)
    castNumber(1)
    castNumber(1.toDouble())
}

fun castNumber(any: Any) {
    when(any) {
        any as? Double -> println("Value is double")
        any as? Int -> println("Value is int")
    }
}

fun checkType(any: Any) {
    when (any) {
        is Course -> {
            println(any)
        }
        is String -> {
            println(any.lowercase())
        }
    }
}
