import java.util.concurrent.atomic.AtomicInteger

object AutoIncInt {
    private val value = AtomicInteger(0)

    operator fun invoke(): Int = try {
        value.incrementAndGet()
    } catch (_: Throwable) {
        value.set(0)
        0
    }
}

operator fun String.inc(): String = "$this $this"

data class EMail(val name: String, val domain: String = "gmail.com")

operator fun EMail.get(i: Int): String {
    require(i in 0..2) {"index can be only 0, 1 or 2"}
    return when (i) {
        0 -> this.name
        1 -> "@"
        2 -> this.domain
        else -> throw IllegalStateException("no way....")
    }
}

fun main() {
    repeat(10) {
        println(AutoIncInt())
    }

    var s = "a"
    repeat(3) {
        println(s++)
    }

    val em = EMail("me")
    repeat(4) {
        println(em[it])
    }
}

