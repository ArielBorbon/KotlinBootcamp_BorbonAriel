package Modulo4Kt

data class Spice12(
    val name: String,
    val spiciness: String = "mild"
)

data class SpiceContainer12(
    val spice: Spice12) {

    val label = spice.name
}

fun main() {

    val curry = Spice12("Curry", "mild")

    val container1 = SpiceContainer12(curry)

    println("Contenedor: ${container1.label}")
    println(container1)
}