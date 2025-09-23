package classes

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("user: $userName authenticated")
    }

}

fun main() {
    Authenticate.authenticate("tim", "123");
}