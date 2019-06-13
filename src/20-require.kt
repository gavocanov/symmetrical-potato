const val dummyConst = "nonsense"

sealed class Base
data class C1(val value: String) : Base()
data class C2(val value: Boolean) : Base()

fun doStuff(base: Base) {
    require(base is C2) { "wrong base of type ${base::class.simpleName}" }
    println(base.value)
}

fun main() {
    require(dummyConst.length < 10) { "dummy is not good enough, wrong length" }
    doStuff(C1("test"))
}