@Suppress("ConstantConditionIf")
fun main() {
    val b = true

    // if/else
    val s1 = if (b) "ok" else "nok"
    println(s1)

    // when
    val s2 = when (s1) {
        "ok" -> "yup"
        "nok" -> "nope"
        else -> "dk"
    }
    println(s2)
}
