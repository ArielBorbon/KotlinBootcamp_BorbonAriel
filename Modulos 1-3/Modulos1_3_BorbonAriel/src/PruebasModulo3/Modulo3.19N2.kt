package PruebasModulo3

import kotlin.random.Random

fun main() {
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }


    gamePlay(rollDice2)
}

fun gamePlay(diceRoll: (Int) -> Int) {
    println(diceRoll(6))
}