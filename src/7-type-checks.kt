fun main() {
    val p: Any? = 1

    if (p is String) {
        println("type: ${p::class.simpleName}, msg: $p")
    } else {
        if (p === null) {
            println("it's null...")
        } else {
            println("not a string, type: ${p::class.simpleName}, strVal: $p")
        }
    }
}
