fun main() {
    val a = "poop"
    println("hello $a world")

    val l = listOf("big", "poop")
    println("hello $l world")
    println("hello ${l.joinToString(" ")} world")

    println(
        """
        line 1
            line 2
  line 3
        a = $a
            l = $l
        """
    )
}
