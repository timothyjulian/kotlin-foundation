package basics

import functions.courseName
import functions.topLevelFunction

fun main() {
    val range = 1..5;
    for (i in  range) {
        println("i : $i")
        println(topLevelFunction())
        println(courseName)
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("i : $i")
    }

    for (i in reverseRange step 2) {
        println("i skip : $i")
    }

    exploreWhile();
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0;
    do {
        println("Value of i is: $i")
        i++
    }while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")
        x++
    }
}
