class Spice(
    val name: String,
    val spiciness: String = "mild")

{
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
        println("Name: $name, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt")


val spices = listOf(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "spicy"),
    Spice("ginger", "mild"),
    Spice("red curry", "medium"),
    Spice("green curry", "spicy"),
    Spice("hot pepper", "very spicy")
)

val mildSpices = spices.filter { it.heat <= 5 }

