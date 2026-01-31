
val trout = "trout"
val haddock = "haddock"
val snapper = "snapper"

println("Me gustan los $trout y los  $snapper estan bien chilos, pero no me caen bien los $haddock.")



val pescado = "Pescadito123"

when (pescado.length) {
    0 -> println("nombre vacio")
    in 3..12 -> println("nombre chilo")
    else -> println("nombre malo")
}




val listaNums = intArrayOf(11, 12, 13, 14, 15)


val listaStrings = mutableListOf<String>()


for (number in listaNums) {
    listaStrings.add(number.toString())
}

println("Lista de Strings: $listaStrings")


val divisibles7 = mutableListOf<Int>()

for (i in 0..100 step 7) {
    divisibles7.add(i)
}

println("Divisibles  7: $divisibles7")