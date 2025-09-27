package nulls

data class Movie(
    val id: Int?, // nullable because first we don't know
    val name: String
)

fun main() {
    var nameNullable: String? = null;
    println("Value is : ${nameNullable?.length ?: 0}") // ? is safe operator

    nameNullable = "Test";
    println("Value is : ${nameNullable?.length ?: 0}") // ?: is Elvis operator for default value

    nameNullable = "Dilip"
    println("Value is : $nameNullable")

    var name: String = "Dilip"

    val movie = Movie(null, "Avengers")
    println("Movie: $movie")

    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertions
    println("Saved Movie: $savedMovie")
}

fun saveMovie(movie: Movie) : Movie {
//    return movie.copy(id = 1)
    return movie
}
