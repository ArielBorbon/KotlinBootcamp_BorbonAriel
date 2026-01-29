package PruebasModulo3

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "Ered pepper")

    val curris = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries ordenados: $curris")

    val CyE = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println("C y E: $CyE")

    val primerosC = spices.take(3).filter { it.startsWith('c') }
    println("Primeros 3 con C: $primerosC")
}