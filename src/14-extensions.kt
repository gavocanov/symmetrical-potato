import kotlin.system.measureTimeMillis

// extension functions
fun String.len1(): Boolean = this.length == 1

// extension properties
val String.len1: Boolean get() = this.len1()

// wtf ??
fun (() -> Unit).profile() = measureTimeMillis {
    this()
}.also {
    println("execution took ${it}ms")
}

fun delay(): Unit = Thread.sleep(100)

fun main() {
    println("test".len1())
    println("test".len1)
    println("t".len1)

    ::delay.profile()
}