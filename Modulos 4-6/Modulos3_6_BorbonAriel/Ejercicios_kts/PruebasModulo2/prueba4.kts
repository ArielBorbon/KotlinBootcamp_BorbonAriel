
val listaConNulos1 = listOf(null, null)
println("Forma 1: $listaConNulos1")


val listaConNulos2: MutableList<String?> = mutableListOf(null, null)
println("Forma 2: $listaConNulos2")

listaConNulos2.add("Si")
println("Forma 2 v2: $listaConNulos2")

var listaNula: List<String>? = null

println("Lista nula: " + "$listaNula")

