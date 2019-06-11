@Suppress("ReplaceWithOperatorAssignment")
fun main() {
    // immutable
    val a = 1

    // mutable
    var b = 2

    // a = a + b // won't compile
    b = a + b
    println(b)
}
