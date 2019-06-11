fun main() {
    fun printIt(p: Any) {
        println(p)
    }

    // implicit [it]
    (1..5).forEach {
        printIt(it)
    }
    println("\n---")

    // function reference
    (1..5).forEach(::printIt)
}
