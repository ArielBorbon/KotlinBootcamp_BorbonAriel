package Modulo6Kt

fun List<Int>.divisibleBy5(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()

    /*
    AVISO, solamente uso el "5" en el divisibleBy para colocarlo como sufijo entre archivos
    ya que en otros modulos (en especial el 2 y 3), declaraba muchas veces la clase pez o
    acuario o spices, lo cual fallaba y comenzaban a chocar clases entre archivos
    por lo que el metodo no es directamente si es divisible entre 5, es si es divisible a la
    lambda que le envies
     */

    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = numbers.divisibleBy5 { it % 3 }
    println(result)
}