infix fun String.shouldEqual(other: String) = this == other

infix fun String.`should equal`(other: String) = this == other

fun main() {
    println("test" shouldEqual "test")
    println("test" `should equal` "test")
}