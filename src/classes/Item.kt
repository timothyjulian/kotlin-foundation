package classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Inside getter")
            return field
        }
        set(value) {
            println("Inside setter")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not Allowed!")
            }
        }

    constructor(name: String) : this() {
        this@Item.name = name
    }
}

fun main() {
    val item = Item("iPhone")
    item.name = "Haha"
    println("item name: ${item.name}")

    val item2 = Item()
    println("item name: ${item2.name}")

    item.price = 10.0
    println(item.price)
}