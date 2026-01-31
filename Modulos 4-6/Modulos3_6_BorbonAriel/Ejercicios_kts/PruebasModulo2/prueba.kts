#!/usr/bin/env kotlin

var welcomeMessage = "Hello and welcome to Kotlin"
when (welcomeMessage.length) {
    0 -> println("Nothing to say?")
    in 1..50 -> println("Perfect")
    else -> println("Too long!")
}

//pregunta de un inciso, colocado aqui para ver el output