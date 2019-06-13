@file:Suppress("CAST_NEVER_SUCCEEDS")

inline fun <reified T> justTry(fn: () -> T): T? = try {
    fn()
} catch (t: Throwable) {
    println("failed to return class ${T::class.simpleName}: ${t.message}")
    null
}

fun main() {
    val a = justTry { true }
    val b = justTry { "a" as Boolean }
    println(a)
    println(b)
}