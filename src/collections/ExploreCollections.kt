package collections

fun main() {
    val names = listOf("hehe", "tim" , "angel")
    println("Names : $names")

    val namesMutable = mutableListOf("hehe", "tim" , "angel")
    println("nameMutableList : $namesMutable")
    namesMutable.add("haha")
    println("nameMutableList after : $namesMutable")

    val set = setOf("hehe", "tim" , "angel")
    println("Set is $set")

    val mutableSet = mutableSetOf("hehe", "tim" , "angel")
    println("mutableSet $mutableSet")
    mutableSet.add("hoho")
    println("mutableSet after $mutableSet")

    val map = mapOf("Tim" to 99, "Yen" to 4)
    println("map $map")

    val mutableMap = mutableMapOf("Tim" to 99, "Yen" to 4)
    println("map mutable $mutableMap")
    mutableMap["lol"] = 10
    println("map mutable after $mutableMap")
}