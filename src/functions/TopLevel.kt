package functions

const val courseName = "Kotlin Programming"

fun topLevelFunction() : Int {
    return (0..10).random()
}

fun main() {
    val num = topLevelFunction()
    print("Num is: $num")
}