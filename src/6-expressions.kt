@Suppress("CAST_NEVER_SUCCEEDS", "ConstantConditionIf")
fun main() {
    val b = true

    // if as expression (implicit return)
    fun ife() = if (b) 1 else 0

    // when expression (implicit return)
    fun we() = when (b) {
        true -> 1
        else -> 0
    }

    // try/catch expression (implicit return)
    fun ee() = try {
        b as Int
        b + 1
    } catch (t: Throwable) {
        println(t.message?.substring(0, 65))
        0
    }

    // test output
    println(ife())
    println(we())
    println(ee())
}