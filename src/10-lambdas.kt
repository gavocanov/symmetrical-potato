fun main() {
    fun printIt(p: Any) {
        print(p)
    }

    val printInt = { i: Int? ->
        println(i)
    }

    printInt(10)
    println("---")

    // implicit [it] in lambdas
    (1..5).forEach {
        printIt(it)
    }
    println("\n---")

    (1..5).forEach {
        print(it + 1)
    }
    println("\n---")

    // ...or function reference
    (1..5).forEach(::printIt)
}
