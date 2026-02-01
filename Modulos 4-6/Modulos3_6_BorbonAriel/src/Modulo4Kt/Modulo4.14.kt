package Modulo4Kt


enum class Color14(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}


interface SpiceColor14 {
    val color: Color14
}


object YellowSpiceColor14 : SpiceColor14 {
    override val color = Color14.YELLOW
}

/*

 1: What is the effect of making Spice a sealed class?
 la clase Spice14 no puede ser heredada fuera de este archivo,
 todas sus subclases deben definirse aquí

 2: Why is this useful?
 Para restringir la jerarquía. kt sabe  cuántas
 subclases hay, lo que permite un control  sobre los tipos de especias permitidos.
*/

sealed class Spice14(
    val name: String,
    val spiciness: String = "mild",
    colorInstance: SpiceColor14
) : SpiceColor14 by colorInstance {
    abstract fun prepareSpice()
}

class Curry14(
    name: String,
    spiciness: String,
    colorInstance: SpiceColor14 = YellowSpiceColor14
) : Spice14(name, spiciness, colorInstance) {

    override fun prepareSpice() {
        println("Preparando el Curry14...")
    }
}

fun main() {
    val myCurry = Curry14("Pollo al Curry", "spicy")

    println("Nombre: ${myCurry.name}")
    println("Color: ${myCurry.color}")
    println("Valor RGB: ${myCurry.color.rgb}")
}