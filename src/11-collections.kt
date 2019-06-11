@Suppress("USELESS_IS_CHECK")
fun main() {
    val l = listOf(10, 1, true, false, 1.01, "test")
    for (i in l) {
        println("${i::class.simpleName}: $i")
    }
    println("---")

    when {
        1 in l -> println("1 is in")
        "test" in l -> println("test is in")
        true in l -> println("true is in")
    }
    println("---")

    val ns = listOf(11, 2, 6, 3, 10)
    val sum = ns
        .filter { it is Int }
        .sortedBy { it }
        .map { it + 1 }
        .reduce { a, n -> a + n }
    println(sum)
}
