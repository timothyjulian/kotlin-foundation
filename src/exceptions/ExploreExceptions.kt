package exceptions


fun returnNothing() : Nothing { // Nothing is function that always throw exception
    throw RuntimeException("Exception")
}

fun main() {
    println(nameLength("Timo"))
    println(nameLength(null))
    returnNothing()
}

fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    }catch (ex: Exception) {
        println("Exceptions is : $ex")
        null
    }

    return result
}
