package Modulo6Kt

import kotlin.math.absoluteValue

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    var currentLocation = Pair(0, 0)

    init {
        map[0][0] = "Llegaste a la cueva misteriosa. [n / s / e / w]"
        map[0][1] = "El camino continua. [n / s / e / w]"
        map[0][2] = "Te mareaste, estas en un lugar nuevo [n / s / e / w]"
        map[0][3] = "El camino adelante se ve peligroso, que haces? [n / s / e / w]"

        map[1][0] = "Un rio esta a tu derecha, que haces? [n / s / e / w]"
        map[1][1] = "Hay una pared a tu izquierda, gastas la bomba para avanzar?. [n / s / e / w]"
        map[1][2] = "Te mordio un perro, corriste 3 veces pero olvidaste a donde. [n / s / e / w]"
        map[1][3] = "No miras nada, tal vez deberias volver. [n / s / e / w]"

        map[2][0] = "Nada destacable por aqui. [n / s / e / w]"
        map[2][1] = "Encontraste $200. [n / s / e / w]"
        map[2][2] = "Escuchas un gritote atras, que haces? [n / s / e / w]"
        map[2][3] = "Estas cerca del pozo del tramposo [n / s / e / w]"

        map[3][0] = "Adelante se mira algo épico.  [n / s / e / w]"
        map[3][1] = "Estas cayendo al pozo del tramposo. [n / s / e / w]"
        map[3][2] = "Encontraste un cofre. [n / s / e / w]"
        map[3][3] = "shhhhh. [n / s / e / w]"
    }

    fun updateLocation(direction: Direction) {
        val x = currentLocation.first
        val y = currentLocation.second

        currentLocation = when (direction) {
            Direction.NORTH -> Pair(x, (y + 1).rem(height))
            Direction.SOUTH -> Pair(x, (y - 1 + height).rem(height))
            Direction.EAST ->  Pair((x + 1).rem(width), y)
            Direction.WEST ->  Pair((x - 1 + width).rem(width), y)
            else -> currentLocation
        }
    }

    fun getDescription(): String {
        return map[currentLocation.first][currentLocation.second]
            ?: "Lugar Desconocido"
    }
}

class Game {
    var path = mutableListOf(Direction.START)
    val map = Location()

    val north = { path.add(Direction.NORTH); map.updateLocation(Direction.NORTH); true }
    val south = { path.add(Direction.SOUTH); map.updateLocation(Direction.SOUTH); true }
    val east =  { path.add(Direction.EAST);  map.updateLocation(Direction.EAST);  true }
    val west =  { path.add(Direction.WEST);  map.updateLocation(Direction.WEST);  true }




    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(north)
        }
    }
}

fun main() {
    val game = Game()

    println("====== AVENTURAS KOTLINESCAS =======")
    println(game.map.getDescription())

    while (true) {
        println()
        print("Presiona una direccion: n/s/e/w: ")
        val input = readLine()

        game.makeMove(input)

        println(game.map.getDescription())
    }
}