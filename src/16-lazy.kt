object LazyThing {
    init {
        println("object init")
    }

    val value by lazy {
        println("value init")
        0
    }
}

fun main() {
    println("start")
    println(LazyThing)
    println(LazyThing.value)
}