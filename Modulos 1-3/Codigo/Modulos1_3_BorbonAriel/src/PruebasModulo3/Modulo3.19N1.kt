package PruebasModulo3

import kotlin.random.Random

fun main() {
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    println("RollDice (6 caras): ${rollDice(6)}")
    println("RollDice (0 caras): ${rollDice(0)}")

    println("RollDice2 (12 caras): ${rollDice2(12)}")
    println("RollDice2 (0 caras): ${rollDice2(0)}")
}
