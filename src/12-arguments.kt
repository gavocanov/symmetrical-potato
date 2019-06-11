fun test(s1: String = "1", s2: String = "2") {
    println("$s1 then $s2")
}

fun main() {
    // default args
    test()

    // positional parameters
    test("one")
    test("one", "two")

    // named arguments
    test(s1 = "one")
    test(s2 = "two")
    test(s1 = "one", s2 = "two")
}