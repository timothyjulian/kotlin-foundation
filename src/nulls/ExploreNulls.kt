package nulls

data class Movie(
    val id: Int?, // nullable because first we don't know
    val name: String
)

fun main() {
    var nameNullable: String? = null;
    println("Value is : $nameNullable")

    nameNullable = "Dilip"
    println("Value is : $nameNullable")

    var name: String = "Dilip"

    val movie = Movie(null, "Avengers")
    println("Movie: $movie")

    val savedMovie = saveMovie(movie)
    println("Saved Movie: $savedMovie")
}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
}
