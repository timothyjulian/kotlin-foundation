package functions

import java.time.LocalDate

fun main() {
    val unit = printName("Tim")
    println("unit is $unit")
    val result = addition(1, 2)
    println("result: $result")
    val resultApproach1 = additionApproach1(1, 2)
    println("result addition: $result")

    printPersonDetails(dob = LocalDate.of(2001, 9, 25), name = "Tim")

}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionApproach1(x: Int, y: Int) = x+y

fun printPersonDetails(name: String,
                       email: String = "",
                       dob: LocalDate = LocalDate.now()
) {
    println("Name is $name, email is $email, dob is $dob")
}

fun printName(name: String): Unit { // Unit correlates to void
    println("Name is : $name")
}
