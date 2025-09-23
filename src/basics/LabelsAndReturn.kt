package basics

fun main() {

    for (i in 1..5) {
        println("i in $i")
        if (i == 3) break
    }

    label()

    for (i in 1..5) {
        println("i in return $i")
        if (i == 3) return
    }

    println("End")
    println("Test")


}

fun label() {

    loop@ for (i in 1..5) {
        println("i in label $i")
        innerloop@ for (j in 1..5) {
            println("j in label $j")
            if (j == 2) continue@loop
        }
    }
}
