package nulls

data class Movie(
    val id: Int?, // nullable because first we don't know
    val name: String
)

fun printName(name: String) {
    println("Name is $name")
}

fun printName1(name: String?) {
    println("Name is $name")
}

fun main() {
    var nameNullable: String? = null;
//    printName(nameNullable!!)
    nameNullable?.run { printName(this) } // nullable to non nullable
    println("Value is : ${nameNullable?.length ?: 0}") // ? is safe operator

    nameNullable = "Test";
    println("Value is : ${nameNullable?.length ?: 0}") // ?: is Elvis operator for default value

    nameNullable = "Dilip"
    println("Value is : $nameNullable")

    var name: String = "Dilip"
    printName1(name) // non nullable to nullable

    val movie = Movie(null, "Avengers")
    println("Movie: $movie")

    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertions
    println("Saved Movie: $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie
}
