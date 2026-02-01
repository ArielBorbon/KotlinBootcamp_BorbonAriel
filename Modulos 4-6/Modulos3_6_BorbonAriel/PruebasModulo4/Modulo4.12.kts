
data class Spice(
    val name: String,
    val spiciness: String = "mild"
)

data class SpiceContainer(
    val spice: Spice
)
{

    val label = spice.name
}

val curry = Spice("Curry", "mild")


val container1 = SpiceContainer(curry)

println("Contenedor 1: ${container1.label}")

println(container1)