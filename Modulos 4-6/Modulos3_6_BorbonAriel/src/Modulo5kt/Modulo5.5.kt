package Modulo5kt

fun main() {
    val allBooks5 = setOf("Hamlet", "Romeo and Juliet", "Macbeth", "King Lear")

    val library5 = mapOf("William Shakespeare" to allBooks5)

    val hasHamlet5 = library5.any { it.value.contains("Hamlet") }

    println("Está Hamlet en la librería?: $hasHamlet5")

    // MutableMap<String (Titulo), String (Autor)
    val moreBooks5 = mutableMapOf("The Jungle Book" to "Rudyard Kipling")


    val authorOfHamlet = moreBooks5.getOrPut("Hamlet") { "Shakespeare" }

    val authorOfJungle = moreBooks5.getOrPut("The Jungle Book") { "Unknown" }

    println("Autor de Hamlet: $authorOfHamlet")
    println("Mapa actualizado: $moreBooks5")
}