package PruebasModulo3

import java.util.Calendar


fun main(args: Array<String>) {
    println("Hello World")
    dayOfWeek2()
}

fun dayOfWeek2() {
    println("Que dia es hoy?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(when (day) {
        1 -> "Domingo"
        2 -> "Lunes"
        3 -> "Martes"
        4 -> "Miercoles"
        5 -> "Jueves"
        6 -> "Viernes"
        7 -> "Sabado"
        else -> "Error"
    })
}