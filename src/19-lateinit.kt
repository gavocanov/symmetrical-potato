class Dummy {
    lateinit var message: String
        private set

    fun init() {
        message = "dummy"
    }
}

fun main() {
    val d = Dummy()
//    d.message
    d.init()
    println(d.message)
}