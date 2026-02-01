class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"


    val heat: Int
        get() {
            return 5
        }
}

val mySpice = SimpleSpice()

println("Nombre: ${mySpice.name}")
println("Nivel Picante: ${mySpice.heat}")