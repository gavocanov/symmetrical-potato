@Suppress(
    "SENSELESS_COMPARISON", "UNREACHABLE_CODE", "RedundantExplicitType", "UNUSED_VALUE",
    "VARIABLE_WITH_REDUNDANT_INITIALIZER", "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE"
)
fun main() {
    var ni: Int? = null
    ni = 12
    ni = null

    var nni: Int = 1
    // nni = null // won't compile
    nni = 100

    // nullability checking
    if (ni === null) {
        println("meh...")
        // println(ni.dec()) // won't compile
        println(ni?.dec())
    } else {
        println("good")
        println(ni.dec())
    }

    // elvis operator
    println(ni ?: "nothing here")
}
