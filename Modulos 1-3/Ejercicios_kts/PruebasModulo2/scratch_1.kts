import kotlin.math.ceil

fun printHello() {
    println("Hello World")
}

val fishes = (2+71+233) - 13
val aquariums1 = fishes / 30

println(fishes)
println(aquariums1)
println()

val totalFish = 2 + 71 + 233 - 13
val aquariums = ceil(totalFish.toDouble() / 30.0).toInt().also {
    println("Acuarios: $it") //el ceil seria para redondear
}

println("Fishis totales: $totalFish")
println()

//solucion de udacity
2.plus(71).plus(233).minus(13)
    .div(30).plus(1)



