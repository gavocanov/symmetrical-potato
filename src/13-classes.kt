@file:Suppress("unused")

import java.time.Duration
import java.time.Instant

// traditional
enum class AnimalType {
    dog, cat, duck, other, mice
}

abstract class CAnimal(open val type: AnimalType = AnimalType.other) {
    open val maxAge: Int = 10
}

class CDog(val subType: String? = null) : CAnimal(AnimalType.dog) {
    override val maxAge = 11
}

data class CCat(
    val name: String = "garfield",
    val weight: Int = 15,
    val predefMeta: Map<String, Any?> = mapOf("aggressive" to true),
    var meta: MutableMap<String, Any?> = mutableMapOf()
) : CAnimal() {
    override val type: AnimalType = AnimalType.cat
}

fun isDog(animal: CAnimal): Boolean = when (animal) {
    is CDog -> true
    else -> false
}

// modeling with enum
enum class EAnimal(
    val type: AnimalType = AnimalType.other,
    val weight: Int
) {
    Dog(AnimalType.dog, 15),
    Mice(AnimalType.mice, 10)
}

fun isDog(animal: EAnimal): Boolean = when (animal) {
    EAnimal.Dog -> true
    EAnimal.Mice -> false
}

// sealed
sealed class SAnimal(open val type: AnimalType = AnimalType.other) {
    data class Dog(val name: String = "ringo") : SAnimal(AnimalType.dog)
    data class Cat(val weight: Int = 10) : SAnimal(AnimalType.cat)
    object Default : SAnimal()
}

fun isDog(animal: SAnimal): Boolean = when (animal) {
    is SAnimal.Dog -> true
    is SAnimal.Cat -> false
    SAnimal.Default -> false
}

fun main() {
    println(CDog("terrier"))

    // data classes
    val cat = CCat()
    println(cat)

    // copy
    println(cat.copy(name = "dot", meta = mutableMapOf("dob" to Instant.now())))

    // destructuring
    val (name, weight, _, meta) = cat
    meta["dob"] = Instant.now() + Duration.ofDays(1)
    println("$name's weight is ${weight}Kg, dob=${meta["dob"]}")


    // enum
    println(EAnimal.Mice)

    // sealed
    val dog = SAnimal.Dog()
    println(dog)
    println(SAnimal.Default)

    //
    println("is cat dog classes = ${isDog(cat)}")
    println("is cat dog enum = ${isDog(EAnimal.Mice)}")
    println("is dog dog sealed: ${isDog(dog)}")
}