fun main() {
    val l = listOf(1, 2, 3, 4, 5)

    // for loop
    for (e in l) {
        print(e)
    }
    println("\n---")

    // while loop
    var i = 0
    while (i < l.size) {
        print(l[i++])
    }
    println("\n---")

    // ranges
    (1..4).forEach {
        print(it)
    }
    println("\n---")

    for (x in 1..4) {
        print(x)
    }
}
