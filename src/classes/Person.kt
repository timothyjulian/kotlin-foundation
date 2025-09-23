package classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("Inside Init Block")
        nameLength = name.length
    }
    // secondary constructor only used as needed
    constructor(email: String, name: String ="", age: Int = 0) : this(name, age) {
        this@Person.email = email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Tim", 24)
//    person.action()
//    println("Name: ${person.name} and age ${person.age}")
//
//    val ki = Person()
//    println("Name: ${ki.name} and age ${ki.age}")

    val el = Person(email = "el@el.com", name = "Tim", age = 9)
    println("Name: ${el.name} and age ${el.age} email ${el.email} name len is ${el.nameLength}")
}