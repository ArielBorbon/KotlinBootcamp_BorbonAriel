package Modulo4Kt

fun main() {

    val myCurry = Curry("Indian Curryyy", "very spicy")

    println("Nombre: ${myCurry.name}")
    println("Color: ${myCurry.color}")
    println("Heat: ${myCurry.heat}")

    myCurry.grind()
    myCurry.prepareSpice()
}


interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

interface Grinder {
    fun grind()
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    colorInstance: SpiceColor
) : SpiceColor by colorInstance {


    abstract fun prepareSpice()

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 7
                "spicy" -> 10
                "very spicy" -> 15
                "nasty" -> 20
                else -> 0
            }
        }

    init {

        println("Init Spice: $name, Color: $color")
    }
}



class Curry(
    name: String,
    spiciness: String,
    colorInstance: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, colorInstance), Grinder {

    override fun grind() {
        println("Grinding $name ...")
    }

    override fun prepareSpice() {
        grind()
    }
}
